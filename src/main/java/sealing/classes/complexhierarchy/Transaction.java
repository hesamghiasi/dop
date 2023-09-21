package sealing.classes.complexhierarchy;

import java.time.LocalDateTime;

public sealed class Transaction permits GenericTransaction, InternalTransaction, PayaTransaction, SatnaTransaction {

    protected  String transactionId;
    protected String sourceBankAccountId;
    protected String destinationBankAccountId;
    protected  Long amount;
    protected  LocalDateTime time;

    protected boolean bankEquals(String firstBankAccountId, String secondBankAccountId) {
        return firstBankAccountId.substring(0,5).equals(secondBankAccountId.substring(0,5));
    }

}
