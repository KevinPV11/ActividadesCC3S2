
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {
    @Test
    public void testQuestionCreation() {
        String descripcion = "¿Cuál es la capital de Francia?";
        String[] opcion = {"Madrid", "Londres", "París", "Berlín"};
        int Opcioncorrecta = 3;

        Question question = new Question(descripcion, opcion, Opcioncorrecta);

        assertNotNull(question, "El objeto de pregunta no debería ser nulo");
        assertEquals(descripcion,question.getDescripcion , "La descripción de la pregunta debería ser correcta");
        assertArrayEquals(opcion, question.getOpcion(), "Las opciones de respuesta deberían ser correctas");
        assertEquals(Opcioncorrecta, question.getOpcioncorrecta, "El índice de la opción correcta debería ser correcto");
    }
}