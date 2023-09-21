package sealing.classes.permitnotneeded;

public sealed class Customer {

    private String firstName;
    private String lastName;
    private String nationalId;

    final class OrdinaryCustomer extends Customer {

    }

    final class VipCustomer extends Customer {

    }
}
