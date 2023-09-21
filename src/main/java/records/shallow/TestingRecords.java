package records.shallow;

import java.util.ArrayList;
import java.util.List;

public class TestingRecords {

    public static void main(String[] args) {
        testAutoInsertedMethods();
    }

    private static void testAutoInsertedMethods() {
        String accountId = "123456";
        Customer customer = new Customer("Hesam", "Ghiasi", "100");
        List<Transaction> transactions = new ArrayList<>();
        BankAccount firstBankAccount = new BankAccount(accountId, customer, true, transactions);
        BankAccount secondBankAccount = new BankAccount(accountId, customer, true, transactions);
        BankAccount thirdBankAccount = new BankAccount(accountId, customer, false, transactions);

        System.out.println("National id for the owner of this account is: " + firstBankAccount.customer().nationalId());
        System.out.println("The bank account is: " + firstBankAccount);
        System.out.println("Are first and second bank accounts equal? " + firstBankAccount.equals(secondBankAccount));
        System.out.println("Are second and third bank accounts equal? " + secondBankAccount.equals(thirdBankAccount));
        System.out.println("Is hash code of first and second bank accounts the same? " +
                (firstBankAccount.hashCode() == secondBankAccount.hashCode()));
        System.out.println("Is hash code of second and third bank accounts the same? " +
                (firstBankAccount.hashCode() == thirdBankAccount.hashCode()));
    }
}
