package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.bca_klikpay;

import lombok.Getter;
import lombok.Setter;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.GetBalancePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.PaymentMethod;

public class BcaKlikpayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }

}
