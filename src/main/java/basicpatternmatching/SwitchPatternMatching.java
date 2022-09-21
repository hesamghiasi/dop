package basicpatternmatching;

public class SwitchPatternMatching {

    public static void main(String[] args) {
        Number number = 45L;
        switch (number){
            case Integer i -> System.out.println("This is an integer " + i);
            case Float f -> System.out.println("This is an float " + f);
            case Double d -> System.out.println("This is an double " + d);
            case Long l -> System.out.println("This is an long " + l);
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}
