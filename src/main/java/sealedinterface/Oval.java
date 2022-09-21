package sealedinterface;

import basicpatternmatching.Point;

public final class Oval implements TwoDimensionalShape {

    private Point center;
    private Float longRadius;
    private Float shortRadius;

    @Override
    public Float calculatePerimeter() {
        System.out.println("calculating perimeter of oval");
        return null;
    }

    @Override
    public Float calculateArea() {
        System.out.println("calculating area of oval");
        return null;
    }
}
