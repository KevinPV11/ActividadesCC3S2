public class QuizTest {
    @Test
    public void testQuestionLoading() {
        Question[] questions = {
                new Question("¿Cuál es la capital de Francia?", new String[]{"Madrid", "Londres", "París", "Berlín"}, 2),
                new Question("¿Cuál es el animal terrestre más grande?", new String[]{"Elefante", "Jirafa", "Rinoceronte", "Ballena Azul"}, 0)
        };

        Quiz quiz = new Quiz(questions);
        assertNotNull(quiz, "El objeto de Quiz no debería ser nulo");

        assertEquals(2, quiz.getQuestions().length, "El número de preguntas cargadas debería ser 2");
    }

    @Test
    public void testAnswerValidation() {
        Question[] questions = {
                new Question("¿Cuál es la capital de Francia?", new String[]{"Madrid", "Londres", "París", "Berlín"}, 2),
                new Question("¿Cuál es el animal terrestre más grande?", new String[]{"Elefante", "Jirafa", "Rinoceronte", "Ballena Azul"}, 0)
        };

        Quiz quiz = new Quiz(questions);

        // Simular respuestas del usuario
        int[] userAnswers = {3, 1};

        quiz.start(userAnswers); // Simular el juego con las respuestas del usuario

        assertEquals(1, quiz.getScore(), "La puntuación debería ser 1");
    }
}