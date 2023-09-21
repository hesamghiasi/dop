package immutability.deep;

public final class Customer {
    private final String firstName;
    private final String lastName;
    private final String nationalId;

    public Customer(String firstName, String lastName, String nationalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalId() {
        return nationalId;
    }
}

