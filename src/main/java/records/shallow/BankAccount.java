package records.shallow;

import java.util.List;

public record BankAccount(String accountId, Customer customer, Boolean isActive, List<Transaction> transactions) {

}
