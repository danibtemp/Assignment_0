public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(String name) {
        super(name);
    }

    public void setDimensions(double radius) {
        this.radius = radius;
    }

    @Override
    public void printDimensions() {
        System.out.println(this.radius);
    }

    @Override
    public double getArea() {
        return PI*(this.radius * this.radius);
    }
}
