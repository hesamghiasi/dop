package immutability.shallow;

import java.util.List;

public final class BankAccount {

    private final String accountId;
    private final Customer customer;
    private final Boolean isActive;
    private final List<Transaction> transactions;

    public BankAccount(String accountId, Customer customer, Boolean isActive, List<Transaction> transactions) {
        this.accountId = accountId;
        this.customer = customer;
        this.isActive = isActive;
        this.transactions = transactions;
    }

    public String getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Boolean getActive() {
        return isActive;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
