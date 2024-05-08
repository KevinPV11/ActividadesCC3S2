

public class Question {
    private String descipcion;
    private String[] opcion;
    private int Opcioncorrecta;

    public Question(String descripcion, String[] opcion, int Opcioncorrecta) {
        this.descipcion = description;
        this.opcion = opcion;
        this.Opcioncorrecta = Opcioncorrecta;
    }
    public String getDescipcion() {
        return descipcion;
    }
    public String[] getOpcion() {
        return opcion;
    }
    public int getOpcioncorrecta() {
        return Opcioncorrecta;
    }
}