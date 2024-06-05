package org.example;

import java.util.Scanner;

public class Game {
    private static final int MAX_ATTEMPTS = 5;
    private String secretWord;
    private String hint;

    public Game() {
        this.secretWord = WordSelector.selectWord();
        this.hint = HintGenerator.generateHint(secretWord);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean guessedCorrectly = false;
        while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
            System.out.println("Pista: " + hint);
            String guess = getGuess(scanner);
            guessedCorrectly = checkGuess(guess);
            attempts++;
        }
        if (!guessedCorrectly) {
            System.out.println("Lo siento, has agotado todos tus intentos. La palabra correcta era: " + secretWord);
        }
        scanner.close();
    }

    private String getGuess(Scanner scanner) {
        System.out.print("Ingresa tu intento: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    private boolean checkGuess(String guess) {
        if (guess.equals(secretWord)) {
            System.out.println("¡Felicidades! Has adivinado la palabra.");
            return true;
        } else {
            String feedback = generateFeedback(guess);
            System.out.println("Intento fallido: " + feedback);
            return false;
        }
    }


    protected String generateFeedback(String guess) {
        int correctLetters = 0;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess.charAt(i)) {
                correctLetters++;
            }
        }
        return "La palabra tiene " + correctLetters + " letras correctas en la posición correcta.";
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}

