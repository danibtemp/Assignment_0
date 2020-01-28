import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square("Square");
        Shape circle = new Circle("Circle");
        Shape triangle = new Triangle("Triangle");
        Shape etriangle = new EquilateralTriangle("Equilateral Triangle");
        Scanner console = new Scanner(System.in);

        System.out.print("Enter height for square: ");
        double height = console.nextDouble();
        System.out.print("Enter width for square: ");
        double width = console.nextDouble();
        ((Square)square).setDimensions(height, width);

        System.out.print("\nEnter radius for circle: ");
        double radius = console.nextDouble();
        ((Circle)circle).setDimensions(radius);

        System.out.print("\nEnter side1 for triangle: ");
        double side1 = console.nextDouble();
        System.out.print("Enter side2 for triangle: ");
        double side2 = console.nextDouble();
        System.out.print("Enter side3 for triangle: ");
        double side3 = console.nextDouble();
        ((Triangle)triangle).setDimensions(side1, side2, side3);

        System.out.print("\nEnter side for equilateral triangle: ");
        double side = console.nextDouble();
        ((EquilateralTriangle)etriangle).setDimensions(side);

        System.out.println("");

        System.out.println(square.getName());
        square.printDimensions();
        System.out.println(square.getArea());

        System.out.println(circle.getName());
        circle.printDimensions();
        System.out.println(circle.getArea());

        System.out.println(triangle.getName());
        triangle.printDimensions();
        System.out.println(triangle.getArea());

        System.out.println(etriangle.getName());
        etriangle.printDimensions();
        System.out.println(etriangle.getArea());
    }
}
