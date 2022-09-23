package sealedclasses;

import patternmatching.Point;

public final class Oval implements TwoDimensionalShape {

    private Point center;
    private Float longRadius;
    private Float shortRadius;

    @Override
    public float calculateArea() {
        return 0;
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }
}
