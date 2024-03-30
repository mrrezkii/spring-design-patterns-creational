package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card;

import lombok.Getter;
import lombok.Setter;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.GetBalancePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.PaymentMethod;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }

}
