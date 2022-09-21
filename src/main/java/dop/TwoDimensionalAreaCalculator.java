package dop;

public class TwoDimensionalAreaCalculator {

    public Float calculateArea(TwoDimensionalShape twoDimensionalShape){
        Float area = null;
        switch (twoDimensionalShape){
            case TwoDimensionalShape.Circle circle -> area = calculateCircleArea(circle.radius());
            case TwoDimensionalShape.Oval oval -> area = calculateOvalArea(oval.longRadius(), oval.shortRadius());
            case TwoDimensionalShape.Rectangle rectangle -> area = calculateRectangleArea(rectangle.vertexTwo().x());
            case TwoDimensionalShape.Triangle triangle ->   area = calculateTriangleArea(triangle.vertexTwo().x());
        }
        return area;
    }

    private Float calculateCircleArea(Float radius){
        return null;
    }

    private Float calculateRectangleArea(Float radius){
        return null;
    }

    private Float calculateOvalArea(Float logRadius, Float shortRadius){
        return null;
    }

    private Float calculateTriangleArea(Float radius){
        return null;
    }

}
