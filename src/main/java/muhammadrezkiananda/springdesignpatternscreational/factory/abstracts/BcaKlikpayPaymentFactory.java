package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts;

import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.bca_klikpay.BcaKlikpayCancelPaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.bca_klikpay.BcaKlikpayGetBalancePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.bca_klikpay.BcaKlilpayChargePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargePaymentRequest() {
        return new BcaKlilpayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelPaymentRequest() {
        return new BcaKlikpayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalancePaymentRequest() {
        return new BcaKlikpayGetBalancePaymentRequest();
    }
}
