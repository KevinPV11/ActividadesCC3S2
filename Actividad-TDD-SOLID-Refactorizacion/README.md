# Actividad TDD, SOLID, Refactorización

## Principio de responsabilidad única - SRP
Divide el código en partes que encapsulen un solo aspecto de la solución.
### Responsabilidades de la clase Shapes

- Método add: Responsable de agregar un objeto Shape a la lista de todas las formas.


    public void add(Shape s) {
        allShapes.add(s);
    }

- Método draw: Tiene 3 responsabilidades.


    public void draw(Graphics g) {
        for (Shape s : allShapes) {
            switch (s.getType()) {
                case "textbox":
                    var t = (TextBox) s;
                    g.drawText(t.getText());
                    break;
                case "rectangle":
                    var r = (Rectangle) s;
                    for (int row = 0;
                         row < r.getHeight();
                         row++) {
                        g.drawLine(0, r.getWidth());
                    }
            }
        }
    }
}
    
* public void draw(Graphics g) es un método público que recibe un objeto de tipo Graphics como parámetro. Este método es responsable de dibujar todas las formas almacenadas en allShapes.
* switch (s.getType()) realiza una operación de selección basada en el tipo de la forma (s.getType()).
* Tiene detalles de como dibujar cada tipo de forma
  * caso **Texbox**

                  case "textbox":
                      var t = (TextBox) s;
                      g.drawText(t.getText());
                      break;
* Si el tipo de forma es "textbox", se convierte el objeto s a un TextBox y se llama al método drawText del objeto Graphics para dibujar el texto
  * **Caso Rectangle**

                  case "rectangle":
                      var r = (Rectangle) s;
                      for (int row = 0;
                           row < r.getHeight();
                           row++) {
                          g.drawLine(0, r.getWidth());
                      }

* Si el tipo de forma es "rectangle", se convierte el objeto s a un Rectangle.
* Luego, se itera desde 0 hasta la altura del rectángulo (r.getHeight()), y en cada iteración se llama al método drawLine del objeto Graphics para dibujar una línea horizontal de ancho r.getWidth()