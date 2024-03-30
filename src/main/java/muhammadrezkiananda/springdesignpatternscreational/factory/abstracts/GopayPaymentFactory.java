package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts;

import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card.CreditCardCancelPaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card.CreditCardChargePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card.CreditCardGetBalancePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.gopay.GopayCancelPaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.gopay.GopayChargePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargePaymentRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelPaymentRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalancePaymentRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
