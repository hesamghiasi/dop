package records.constructors;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Random;

public record Transaction(String transactionId, Long amount, LocalDateTime time) {

    /**
     * custom constructor
     * @param amount
     */
    public Transaction(Long amount) {
        this(randomTransactionIdGenerator(), amount, LocalDateTime.now());
    }

    private static String randomTransactionIdGenerator() {
        return Long.toString(new Random().nextLong());
    }
}
