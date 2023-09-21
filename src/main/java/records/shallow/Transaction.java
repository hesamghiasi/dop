package records.shallow;

import java.time.LocalDateTime;

public record Transaction(String transactionId, Long amount, LocalDateTime time) {
}
