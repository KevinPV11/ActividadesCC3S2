package shapes;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

