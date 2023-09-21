package immutability.shallow;

import java.time.LocalDateTime;

public final class Transaction {

    private final String transactionId;
    private final Long amount;
    private final LocalDateTime time;

    public Transaction(String transactionId, Long amount, LocalDateTime time) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.time = time;
    }
}
