package sealedclasses;

import patternmatching.Point;

public final class Circle implements TwoDimensionalShape {

    private Point center;
    private Float radius;
    @Override
    public float calculateArea() {
        return 0;
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }
}
