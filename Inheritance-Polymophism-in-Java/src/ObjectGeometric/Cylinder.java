package ObjectGeometric;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color, double radius) {
        super(color, radius);
    }

    public Cylinder(double height, String color, double radius) {
        super(color, radius);
        this.height = height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double getHeight () {
        return height;
    }

    public double getVolume () {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "A cylinder with height = " +
                getHeight() +
                ", Volume = " +
                getVolume();
    }
}
