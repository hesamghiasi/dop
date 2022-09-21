package patternmatching;

public class Point {
    private float x;
    private float y;

    @Override
    public boolean equals(Object o) {
        return o instanceof Point point
            && point.x == this.x
            && point.y == this.y;
    }
}
