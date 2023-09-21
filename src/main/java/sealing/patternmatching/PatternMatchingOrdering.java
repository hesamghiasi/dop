package sealing.patternmatching;

import java.util.*;

public class PatternMatchingOrdering {
    static Object get(Collection<String> c) {
        return switch (c) {
            case Stack<String> s when !s.peek().isEmpty() -> s.pop();
            case LinkedList<?> l -> l.getFirst();
            case Vector<?> v -> v.lastElement();
            case AbstractSequentialList<?> l -> "";
            default -> c;
        };
    }

    public static void main(String[] argv) {

        var stack = new Stack<String>();
        stack.push("firstStackItemAdded");
        stack.push("secondStackItemAdded");
        stack.push("thirdStackItemAdded");

        var linkedList = new LinkedList<String>();

        linkedList.add("firstLinkedListElementAdded");
        linkedList.add("secondLinkedListElementAdded");
        linkedList.add("thirdLinkedListElementAdded");

        var vector = new Vector<String>();

        vector.add("firstVectorElementAdded");
        vector.add("secondVectorElementAdded");
        vector.add("thirdVectorElementAdded");

        System.out.println(get(stack));
        System.out.println(get(linkedList));
        System.out.println(get(vector));
    }
}

