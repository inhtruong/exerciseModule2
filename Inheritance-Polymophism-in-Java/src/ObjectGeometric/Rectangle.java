package ObjectGeometric;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle () {

    }

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double  length, String color, boolean filled) {
        super (color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public double getWidth () {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" +
                getWidth() +
                " and  length =" +
                getLength() +
                ", which is a subclass of " +
                super.toString();
    }

}
