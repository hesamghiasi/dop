package sealedinterface;


public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        getArea(triangle);
        //// TODO: 21.09.22 use switch to get perimeter
    }

    private static Float getArea(TwoDimensionalShape shape){
        Float area = null;
        switch (shape){
            case Circle circle -> area = circle.calculateArea();
            case Rectangle rectangle -> area = rectangle.calculateArea();
            case Triangle triangle -> area = triangle.calculateArea();
            case Oval oval -> area = oval.calculateArea();
        }
        return area;
    }
}
