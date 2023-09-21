package sealing.patternmatching;

import java.util.List;

public class SwitchCasePatternMatching {

    public static void main(String[] args) {

        Number firstInstance = 45L;
        Number secondInstance = 67;
        Number thirdInstance = 67.3F;
        Number fourthInstance = 67.3;

        detectNumberType(List.of(firstInstance, secondInstance, thirdInstance, fourthInstance));

    }

    private static void detectNumberType(List<Number> numbers) {

        numbers.forEach(number -> {
            switch (number){
                case Integer i -> System.out.println(i + " is an integer");
                case Long l -> System.out.println(l + " is a long number");
                case Float f -> System.out.println(f + " is a float number");
                case Double d -> System.out.println(d + " is a double number");
                default -> throw new IllegalStateException("Unexpected value: " + number);
            }
        });
    }
}
