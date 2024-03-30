package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.GetBalancePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.PaymentMethod;

public class GopayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }

}
