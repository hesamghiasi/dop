package sealedclasses;

import patternmatching.Point;

public final class Triangle implements TwoDimensionalShape {

    private Point vertexOne;
    private Point vertexTwo;
    private Point vertexThree;
    @Override
    public float calculateArea() {
        return 0;
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }
}
