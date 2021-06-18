package Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(2.0);
        shapes[1] = new Square(10);

        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
