public class Circle {
    protected double radius = 1.0;
    protected String color = "red";
    static final Double PI = 3.14;
    public Circle() {

    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }
    
    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }

    public String toString() {
        return "Circle[radius=" + Double.toString(radius) + ",color=" + this.color + "]";
    }
}
