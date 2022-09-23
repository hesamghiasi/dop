package sealedclasses;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(getArea(circle));
    }

    private static Float getArea(TwoDimensionalShape shape) {
        return switch (shape){
            case Circle circle -> circle.calculateArea();
            case Oval oval -> oval.calculateArea();
            case Rectangle rectangle -> rectangle.calculateArea();
            case Triangle triangle -> triangle.calculateArea();
        };
    }

    private static Float getPerimeter(TwoDimensionalShape shape) {
        return switch (shape){

            case Circle circle -> circle.calculatePerimeter();
            case Oval oval -> oval.calculatePerimeter();
            case Rectangle rectangle -> null;
            case Triangle triangle -> null;
        };
    }
}
