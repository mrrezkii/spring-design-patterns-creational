package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts;

import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card.CreditCardCancelPaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card.CreditCardChargePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargePaymentRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelPaymentRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalancePaymentRequest() {
//        throw new UnsupportedOperationException("Get balance is not supported for credit card payment");
        return new CreditCardGetBalancePaymentRequest();
    }
}
