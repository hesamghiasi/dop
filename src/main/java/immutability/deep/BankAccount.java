package immutability.deep;

import java.util.Collections;
import java.util.List;


public final class BankAccount {
    private final String accountId;
    private final Customer customer;
    private final boolean isActive;
    private final List<Transaction> transactions;

    public BankAccount(String accountId, Customer customer, boolean isActive, List<Transaction> transactions) {
        this.accountId = accountId;
        this.customer = new Customer(customer.getFirstName(), customer.getLastName(), customer.getNationalId());
        this.isActive = isActive;
        this.transactions = Collections.unmodifiableList(transactions); // Deep immutable

        // Ensure that the transaction objects are also deep immutable
        for (int i = 0; i < this.transactions.size(); i++) {
            Transaction originalTransaction = transactions.get(i);
            this.transactions.set(i, new Transaction(originalTransaction.getTransactionId(), originalTransaction.getDate(), originalTransaction.getAmount()));
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return new Customer(customer.getFirstName(), customer.getLastName(), customer.getNationalId());
    }

    public boolean isActive() {
        return isActive;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}

