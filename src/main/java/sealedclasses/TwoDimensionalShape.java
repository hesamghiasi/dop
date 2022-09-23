package sealedclasses;

public sealed interface TwoDimensionalShape permits Circle, Oval, Rectangle, Triangle {

    float calculateArea();

    float calculatePerimeter();
}
