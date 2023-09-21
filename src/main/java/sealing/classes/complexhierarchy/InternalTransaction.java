package sealing.classes.complexhierarchy;

import java.time.LocalDateTime;

public final class InternalTransaction extends Transaction {
    public InternalTransaction(String transactionId, String sourceBankAccountId, String destinationBankAccountId, Long amount, LocalDateTime time) {
        if (! bankEquals(sourceBankAccountId, destinationBankAccountId))
            throw new IllegalArgumentException();
        this.transactionId = transactionId;
        this.sourceBankAccountId = sourceBankAccountId;
        this.destinationBankAccountId = destinationBankAccountId;
        this.amount = amount;
        this.time = time;
    }


    public String getId() {
        return this.transactionId;
    }
}
