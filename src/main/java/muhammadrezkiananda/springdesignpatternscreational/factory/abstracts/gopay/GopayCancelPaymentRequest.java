package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.CancelPaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.PaymentMethod;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
