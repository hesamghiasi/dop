package visitorpattern.dop;

import java.util.ArrayList;
import java.util.List;

public sealed interface TwoDimensionalShape {
    record Circle(int id, int x, int y, float radius) implements TwoDimensionalShape{}
    record Dot(int id, int x, int y) implements TwoDimensionalShape{}
    record Rectangle(int id, int x, int y, float width, float height) implements TwoDimensionalShape{}
    record CompoundShape(int id, List<TwoDimensionalShape> children) implements TwoDimensionalShape{
        public void add(TwoDimensionalShape shape) {
            children.add(shape);
        }

        public CompoundShape(int id) {
            this(id, new ArrayList<>());
        }
    }

}
