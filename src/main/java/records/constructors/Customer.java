package records.constructors;

public record Customer(String firstName, String lastName, String nationalId) {

    /**
     * Compact constructor
     * @param firstName
     * @param lastName
     * @param nationalId
     */
    public Customer {

        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        if (nationalId.length() != 10)
            throw new IllegalArgumentException();
    }
}
