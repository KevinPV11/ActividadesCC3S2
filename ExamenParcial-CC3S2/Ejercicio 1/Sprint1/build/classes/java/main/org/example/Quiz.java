import java.util.Scanner;

public class Quiz {
    private Pregunta[] preguntas;
    private int score;

    public Quiz(Pregunta[] preguntas) {
        this.preguntas = preguntas;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas seleccionando el número de la opción correcta.");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + questions[i].getDescription());
            String[] options = questions[i].getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ") " + options[j]);
            }
            System.out.print("Tu respuesta: ");
            int userChoice = scanner.nextInt();
            if (userChoice == questions[i].getCorrectOptionIndex() + 1) {
                System.out.println("¡Correcto!");
                score++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era la opción " + (questions[i].getCorrectOptionIndex() + 1));
            }
        }

        System.out.println("Juego terminado. Aquí está tu puntuación:");
        System.out.println("Preguntas contestadas: " + questions.length);
        System.out.println("Respuestas correctas: " + score);
        System.out.println("Respuestas incorrectas: " + (questions.length - score));
    }
}