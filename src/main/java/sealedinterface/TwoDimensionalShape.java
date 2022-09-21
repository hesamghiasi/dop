package sealedinterface;

public sealed interface TwoDimensionalShape permits Circle, Rectangle, Triangle, Oval {

    public Float calculatePerimeter();

    public Float calculateArea();
}
