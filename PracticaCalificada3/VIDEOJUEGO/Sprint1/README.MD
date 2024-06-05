# CODIGO REFACTORIZADO

## Game
### Principios aplicados:

* La clase Game ahora se enfoca únicamente en la lógica del juego.
* Las dependencias (WordSelector y HintGenerator) se pasan a través del constructor en lugar de ser instanciadas directamente dentro de la clase. Esto facilita la inyección de dependencias y las pruebas unitarias.

```java
package org.example;

import java.util.Scanner;

public class Game {
    private static final int MAX_ATTEMPTS = 5;
    private final String secretWord;
    private final String hint;
    private final Scanner scanner;

    public Game(WordSelector wordSelector, HintGenerator hintGenerator, Scanner scanner) {
        this.secretWord = wordSelector.selectWord();
        this.hint = hintGenerator.generateHint(secretWord);
        this.scanner = scanner;
    }

    public void play() {
        int attempts = 0;
        boolean guessedCorrectly = false;
        while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
            System.out.println("Pista: " + hint);
            String guess = getGuess();
            guessedCorrectly = checkGuess(guess);
            attempts++;
        }
        if (!guessedCorrectly) {
            System.out.println("Lo siento, has agotado todos tus intentos. La palabra correcta era: " + secretWord);
        }
    }

    private String getGuess() {
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
        return "La";
    }
}
```

## HintGenerator
### Principios aplicados:

* La interfaz HintGenerator define una única responsabilidad, que es generar una pista a partir de una palabra.


    package org.example;

    public interface HintGenerator {
    String generateHint(String word);
    }

## SimpleHintGenerator
### Principios aplicados:

*  La clase SimpleHintGenerator implementa la lógica específica de generación de pistas.
*  La clase puede ser extendida para crear nuevos tipos de generadores de pistas sin modificar la implementación existente.


    package org.example;

    public class SimpleHintGenerator implements HintGenerator {
    @Override
        public String generateHint(String word) {
            StringBuilder hint = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                hint.append("_ ");
            }
            return hint.toString().trim();
        }
    }
## WordSelector
## Principios aplicados:

* La interfaz WordSelector define una única responsabilidad, que es seleccionar una palabra.

        package org.example;

        public interface WordSelector {
            String selectWord();
        }

## RandomWordSelector
### Principios aplicados:

*  La clase RandomWordSelector implementa la lógica específica de selección de palabras al azar.
*  La clase puede ser extendida para crear nuevos tipos de selectores de palabras sin modificar la implementación existente.

        package org.example;

        import java.util.Random;

        public class RandomWordSelector implements WordSelector {
            private static final String[] WORDS = {"casa", "perro", "computadora", "juego", "sol"};

            @Override
            public String selectWord() {
                Random random = new Random();
                int index = random.nextInt(WORDS.length);
                return WORDS[index];
            }
        }

