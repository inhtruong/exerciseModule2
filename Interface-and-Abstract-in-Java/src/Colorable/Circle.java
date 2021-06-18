package Colorable;

public class Circle extends Shape {
    private  double radius = 1.0;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerameter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                " Area = " + getArea() +
                " Perameter = " + getPerameter() +
                '}';
    }
}
