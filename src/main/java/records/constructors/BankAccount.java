package records.constructors;

import java.util.List;

public record BankAccount(String accountId, Customer customer, Boolean isActive, List<Transaction> transactions) {

    /**
     * Canonical constructor
     * @param accountId
     * @param customer
     * @param isActive
     * @param transactions
     */
    public BankAccount(String accountId, Customer customer, Boolean isActive, List<Transaction> transactions) {
        this.accountId = accountId;
        this.customer = customer;
        this.isActive = isActive;
        this.transactions = transactions;
    }



}
