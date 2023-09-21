package visitorpattern.dop;



public class Demo {
    public static void main(String[] args) {
        TwoDimensionalShape.Dot dot = new TwoDimensionalShape.Dot(1, 10, 55);
        TwoDimensionalShape.Circle circle = new TwoDimensionalShape.Circle(2, 23, 15, 10);
        TwoDimensionalShape.Rectangle rectangle = new TwoDimensionalShape.Rectangle(3, 10, 17, 20, 30);

        TwoDimensionalShape.CompoundShape compoundShape = new TwoDimensionalShape.CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        TwoDimensionalShape.CompoundShape c = new TwoDimensionalShape.CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(TwoDimensionalShape... shapes) {
        System.out.println(XmlExporter.exportXml(shapes));
    }
}
