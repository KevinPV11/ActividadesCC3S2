package shapes;

public class TextBox implements Shape {
    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    @Override
    public String getType() {
        return "textbox";
    }

    public String getText() {
        return text;
    }
}


