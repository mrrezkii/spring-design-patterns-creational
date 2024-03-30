package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.credit_card;

import lombok.Getter;
import lombok.Setter;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.ChargePaymentRequest;
import muhammadrezkiananda.springdesignpatternscreational.factory.abstracts.PaymentMethod;

public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
