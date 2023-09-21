package sealing.interfaces;

import java.util.Objects;

public class Point {

    private Float x;
    private Float y;

    @Override
    public boolean equals(Object o) {
       return o instanceof Point point
               && point.x == this.x
               && point.y == this.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
