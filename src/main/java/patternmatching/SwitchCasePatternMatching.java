package patternmatching;

public class SwitchCasePatternMatching {

    public static void main(String[] args) {

        Number number = 45L;
        switch (number){
            case Integer i -> System.out.println(i + " is an integer");
            case Long l -> System.out.println(l + " is a long numer");
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}
