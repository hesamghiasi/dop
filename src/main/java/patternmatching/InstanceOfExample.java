package patternmatching;

public class InstanceOfExample {

    public static void main(String[] args) {

        Number number = 45L;
        if (number instanceof Integer i) {
            System.out.printf(i + " is an integer");
        } else if(number instanceof Long l){
            System.out.println(l + " is a long number");
        }
    }
}
