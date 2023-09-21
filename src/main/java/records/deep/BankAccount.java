package records.deep;

import java.util.Collections;
import java.util.List;


public record BankAccount(String accountId, Customer customer, boolean isActive, List<Transaction> transactions) {
    public BankAccount(String accountId, Customer customer, boolean isActive, List<Transaction> transactions) {
        this.accountId = accountId;
        this.customer = new Customer(customer.firstName(), customer.lastName(), customer.nationalId());
        this.isActive = isActive;
        this.transactions = Collections.unmodifiableList(transactions); // Deep immutable

        // Ensure that the transaction objects are also deep immutable
        for (int i = 0; i < this.transactions.size(); i++) {
            Transaction originalTransaction = transactions.get(i);
            this.transactions.set(i, new Transaction(originalTransaction.transactionId(), originalTransaction.date(), originalTransaction.amount()));
        }
    }

    @Override
    public Customer customer() {
        return new Customer(customer.firstName(), customer.lastName(), customer.nationalId());
    }

    @Override
    public List<Transaction> transactions() {
        return Collections.unmodifiableList(transactions);
    }
}

