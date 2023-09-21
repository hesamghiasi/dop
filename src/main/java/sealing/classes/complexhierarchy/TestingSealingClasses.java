package sealing.classes.complexhierarchy;

import java.util.List;

public class TestingSealingClasses {

    public static void main(String[] args) {

        Transaction transactionOne = new InternalTransaction("100", "123456",
                "123457", 10_000_000_000L, null);
        Transaction transactionTwo = new PayaTransaction("200", "123456",
                "123857", 10_000_000L, null);
        Transaction transactionThree = new SatnaTransaction("300", "123456",
                "123857", 600_000_000L, null);
        processTransactions(List.of(transactionOne, transactionTwo, transactionThree));
    }


    private static void processTransactions(List<Transaction> transactions) {
        transactions.forEach(transaction -> {
            if (transaction instanceof InternalTransaction internalTransaction) {
                System.out.println("found an internal transaction " + internalTransaction.getId());
            } else if (transaction instanceof PayaTransaction payaTransaction) {
                System.out.println("found a paya transaction " + payaTransaction.getId());
            } else if (transaction instanceof SatnaTransaction satnaTransaction ) {
                System.out.println("found a satna transaction " + satnaTransaction.getId());
            }
        });
    }
}
