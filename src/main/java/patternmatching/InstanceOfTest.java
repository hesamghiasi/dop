package patternmatching;

public class InstanceOfTest {

    public static void main(String[] args) {

        Number object = 45L;
        if (object instanceof Integer i) {
            System.out.println("this is an integer " + i.byteValue());
        } else if (object instanceof Long l) {
            System.out.println("this is a long number " + l.byteValue());
        }
    }
}




