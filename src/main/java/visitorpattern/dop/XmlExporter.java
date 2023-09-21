package visitorpattern.dop;


import java.util.Arrays;
import java.util.List;

public class XmlExporter {

    public static String exportXml(TwoDimensionalShape[] shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        Arrays.stream(shapes).forEach(shape -> sb.append(exportXmlForOne(shape)));
        return sb.toString();
    }

    private static String exportXmlForOne(TwoDimensionalShape shape) {
        return switch (shape) {
            case TwoDimensionalShape.Circle circle -> visitCircle(circle);
            case TwoDimensionalShape.CompoundShape compoundShape -> visitCompoundGraphic(compoundShape);
            case TwoDimensionalShape.Dot dot -> visitDot(dot);
            case TwoDimensionalShape.Rectangle rectangle -> visitRectangle(rectangle);
        };
    }

    public static String visitDot(TwoDimensionalShape.Dot d) {
        return "<dot>" + "\n" +
                "    <id>" + d.id() + "</id>" + "\n" +
                "    <x>" + d.x() + "</x>" + "\n" +
                "    <y>" + d.y() + "</y>" + "\n" +
                "</dot>";
    }

    public static String visitCircle(TwoDimensionalShape.Circle c) {
        return "<circle>" + "\n" +
                "    <id>" + c.id() + "</id>" + "\n" +
                "    <x>" + c.x() + "</x>" + "\n" +
                "    <y>" + c.y() + "</y>" + "\n" +
                "    <radius>" + c.radius() + "</radius>" + "\n" +
                "</circle>";
    }

    public static String visitRectangle(TwoDimensionalShape.Rectangle r) {
        return "<rectangle>" + "\n" +
                "    <id>" + r.id() + "</id>" + "\n" +
                "    <x>" + r.x() + "</x>" + "\n" +
                "    <y>" + r.y() + "</y>" + "\n" +
                "    <width>" + r.width() + "</width>" + "\n" +
                "    <height>" + r.height() + "</height>" + "\n" +
                "</rectangle>";
    }

    public static String visitCompoundGraphic(TwoDimensionalShape.CompoundShape cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.id() + "</id>" + "\n" +
                _visitCompoundGraphic(cg) +
                "</compound_graphic>";
    }

    private static String _visitCompoundGraphic(TwoDimensionalShape.CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (TwoDimensionalShape shape : cg.children()) {
            String obj = exportXmlForOne(shape);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
