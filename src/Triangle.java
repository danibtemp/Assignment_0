import java.lang.Math;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double halfPerimeter;

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.halfPerimeter = (this.side1 + this.side2 + this.side3)/2;
    }

    @Override
    public void printDimensions() {
        System.out.println(this.side1 + "x" + this.side2 + "x" + this.side3);
    }

    @Override
    public double getArea() {
        return Math.sqrt(this.halfPerimeter*(this.halfPerimeter - this.side1)*(this.halfPerimeter - this.side2)*(this.halfPerimeter - this.side2));
    }
}
