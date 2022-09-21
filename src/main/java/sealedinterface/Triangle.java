package sealedinterface;

import basicpatternmatching.Point;

public final class Triangle implements TwoDimensionalShape {

    private Point vertexOne;
    private Point vertexTwo;
    private Point vertexThree;

    @Override
    public Float calculatePerimeter() {
        System.out.println("calculating perimeter of triangle");
        return null;
    }

    @Override
    public Float calculateArea() {
        System.out.println("calculating area of triangle");
        return null;
    }
}
