package dop;

public class TwoDimensionalAreaCalculator {

    public Float getArea(TwoDimensionalShape shape){
       return switch (shape){
            case TwoDimensionalShape.Circle circle -> getCircleArea(circle.radius());
            case TwoDimensionalShape.Oval oval -> getOvalAread();
            case TwoDimensionalShape.Rectangle rectangle -> getRectangleArea();
            case TwoDimensionalShape.Triangle triangle -> getTriangleArea();
        };
    }

    private Float getTriangleArea() {
        return null;
    }

    private Float getRectangleArea() {
        return null;
    }

    private Float getOvalAread() {
        return null;
    }

    private Float getCircleArea(Float radius) {
        return 0f;
    }
}
