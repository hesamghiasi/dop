package immutability.shallow;

public final class Customer {

    private final String firstName;
    private final String lastName;
    private final String nationalId;

    public Customer(String firstName, String lastName, String nationalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
    }
}
