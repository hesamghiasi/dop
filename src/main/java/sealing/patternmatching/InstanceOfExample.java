package sealing.patternmatching;

import java.util.List;

public class InstanceOfExample {

    public static void main(String[] args) {

        Number firstInstance = 45L;
        Number secondInstance = 67;
        Number thirdInstance = 67.3F;
        Number fourthInstance = 67.3;

        detectNumberType(List.of(firstInstance, secondInstance, thirdInstance, fourthInstance));
    }

    private static void detectNumberType(List<Number> numbers) {
        numbers.forEach(number -> {
            if (number instanceof Integer i) {
                System.out.println(i + " is an integer");
            } else if(number instanceof Long l){
                System.out.println(l + " is a long number");
            } else if(number instanceof Float f) {
                System.out.println(f + " is a float number");
            } else if(number instanceof Double d) {
                System.out.println(d + " is a double number");
            }
        });
    }
}
