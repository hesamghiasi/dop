package dop;

import java.util.List;

public sealed interface PaymentInitiationResponse {
    record MiddleEastBankInitiationResponse(String transactionId, Long reference, String result, List<String> removedTransferItemReports) implements PaymentInitiationResponse { }
    record MelliBankInitiationResponse(Long moneyTransferTrackingId) implements PaymentInitiationResponse { }
    record PasargadBankInitiationResponse(Long moneyTransferTrackingId) implements PaymentInitiationResponse { }
    record MellatBankInitiationResponse(Long moneyTransferTrackingId) implements PaymentInitiationResponse {}
}
