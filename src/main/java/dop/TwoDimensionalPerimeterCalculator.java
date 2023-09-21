package dop;

public class TwoDimensionalPerimeterCalculator {
    
    public Float getPerimeter(TwoDimensionalShape shape){
        return switch (shape){

            case TwoDimensionalShape.Circle circle -> calculateCirclePerimeter(circle.radius());
            case TwoDimensionalShape.Oval oval -> null;
            case TwoDimensionalShape.Rectangle rectangle -> null;
            case TwoDimensionalShape.Triangle triangle -> null;
        };
    }

    private Float calculateCirclePerimeter(Float radius) {
        return null;
    }
}
