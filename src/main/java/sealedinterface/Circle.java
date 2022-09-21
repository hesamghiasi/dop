package sealedinterface;

import basicpatternmatching.Point;

public final class Circle implements TwoDimensionalShape {

    private Point center;
    private Float radius;

    @Override
    public Float calculatePerimeter() {
        System.out.println("calculating perimeter of circle");
        return null;
    }

    @Override
    public Float calculateArea() {
        System.out.println("calculating area of circle");
        return null;
    }
}
