package sealedinterface;

import basicpatternmatching.Point;

public final class Rectangle implements TwoDimensionalShape {

    private Point vertexOne;
    private Point vertexTwo;
    private Point vertexThree;
    private Point vertexFour;

    @Override
    public Float calculatePerimeter() {
        System.out.println("calculating perimeter of rectangle");
        return null;
    }

    @Override
    public Float calculateArea() {
        System.out.println("calculating area of rectangle");
        return null;
    }
}
