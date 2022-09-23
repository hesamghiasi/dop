package dop;

public sealed interface TwoDimensionalShape {
    record Circle(Point center, Float radius) implements TwoDimensionalShape{}
    record Oval(Point center, Float shortRadius, Float longRadius) implements TwoDimensionalShape{}
    record Rectangle(Point vertexOne, Point vertexTwo, Point vertexThree, Point vertexFour) implements TwoDimensionalShape{}
    record Triangle(Point vertexOne, Point vertexTwo, Point vertexThree) implements TwoDimensionalShape{}

}
record Point(Float x, Float y){}
