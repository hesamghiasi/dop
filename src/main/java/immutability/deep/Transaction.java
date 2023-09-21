package immutability.deep;

public final class Transaction {
    private final String transactionId;
    private final String date;
    private final double amount;

    public Transaction(String transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}

