package Colorable;

public class Square extends Shape implements Colorable {
    private double length = 2.0;

    Square() {

    }

    Square(double length) {
        this.length = length;
    }

    Square(String color, boolean filled, double length) {
        super(color,filled);
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                " length=" + length +
                " Area = " + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println (" Color all four sides.");
    }
}
