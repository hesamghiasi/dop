public class Dop {

    public static void main(String[] args) {
        Banks bank = new Banks.Sepah();
        switch (bank) {
        case Banks.Mellat mellat -> System.out.println("mellat");
        case Banks.Sepah sepah -> System.out.println("sepah");
        }
    }
}




