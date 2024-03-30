package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts;

public interface PaymentFactory {
    ChargePaymentRequest createChargePaymentRequest();
    CancelPaymentRequest createCancelPaymentRequest();
    GetBalancePaymentRequest createGetBalancePaymentRequest();
}
