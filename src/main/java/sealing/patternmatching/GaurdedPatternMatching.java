package sealing.patternmatching;

import java.util.List;

public class GaurdedPatternMatching {

    public static void main(String[] args) {

        Number firstInstance = 45L;
        Number secondInstance = 9;
        Number thirdInstance = 67.3F;
        Number fourthInstance = 67.3;

        detectNumberType(List.of(firstInstance, secondInstance, thirdInstance, fourthInstance));

    }

    private static void detectNumberType(List<Number> numbers) {
        numbers.forEach(number -> {
            switch (number) {
                case Integer i when i < 10 -> System.out.println(i + " is an integer less than 10");
                case Integer i when i > 10 -> System.out.println(i + " is an integer larger than 10");
                case Integer i when isPerfectSquare(i.doubleValue()) ->
                        System.out.println(i + " is a perfect square root");

                case Long l -> System.out.println(l + " is a long number");
                case Float f -> System.out.println(f + " is a float number");
                case Double d -> System.out.println(d + " is a double number");
                case null -> System.out.println("null received");
                default -> throw new IllegalStateException("Unexpected value: " + number);
            }
        });
    }


    public static boolean isPerfectSquare(double num) {
        long longNum = (long) num;
        long squareRoot = (long) Math.sqrt(longNum);
        return squareRoot * squareRoot == longNum;
    }



}
