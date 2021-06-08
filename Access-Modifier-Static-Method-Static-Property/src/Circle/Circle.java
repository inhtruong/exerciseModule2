package Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }

    protected double getArea() {
        return 2 * Math.PI * radius;
    }

//    public String toString() {
//
//    }

    protected void Show() {
        System.out.printf("Radius of the circle: %.1f\n", getRadius());
        System.out.printf("Color of the circle: %s\n", getColor());
        System.out.printf("Area: %.1f", getArea());
    }
}
