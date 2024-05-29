import shapes.Shapes;
import shapes.TextBox;
import shapes.Rectangle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        // Add a TextBox object
        TextBox textBox = new TextBox("Hello, World!");
        shapes.add(textBox);

        // Add a Rectangle object
        Rectangle rectangle = new Rectangle(50, 20);

        shapes.add(rectangle);
        shapes.add(textBox);

        // Create a Graphics object

        // Draw the shapes
        
    }
}