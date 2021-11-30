public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    public Cylinder(double radius, double height, String color) {
        this.color = color;
        this.height = height;
        this.radius = radius;
    }

    

}
