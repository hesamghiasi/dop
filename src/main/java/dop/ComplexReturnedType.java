package dop;

public class ComplexReturnedType {

    public static void main(String[] args) {

    }

    private static String processPaymentResponse (PaymentInitiationResponse response) {
        return switch (response) {
            case PaymentInitiationResponse.MellatBankInitiationResponse mellatBankInitiationResponse -> "Mellat";
            case PaymentInitiationResponse.MelliBankInitiationResponse melliBankInitiationResponse -> "Melli";
            case PaymentInitiationResponse.MiddleEastBankInitiationResponse middleEastBankInitiationResponse -> "Middle East";
            case PaymentInitiationResponse.PasargadBankInitiationResponse pasargadBankInitiationResponse -> "Pasargad";
        };
    }
}