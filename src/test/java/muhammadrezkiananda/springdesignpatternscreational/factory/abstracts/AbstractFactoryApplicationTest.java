package muhammadrezkiananda.springdesignpatternscreational.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAbstractFactory(){
        PaymentFactory creditCardPaymentFactory = applicationContext.getBean("creditCardPaymentFactory", PaymentFactory.class);
        PaymentFactory gopayPaymentFactory = applicationContext.getBean("gopayPaymentFactory", PaymentFactory.class);
        PaymentFactory bcaKlikpayPaymentFactory = applicationContext.getBean("bcaKlikpayPaymentFactory", PaymentFactory.class);

        charge(creditCardPaymentFactory);
        cancel(creditCardPaymentFactory);
        System.out.println("Credit card balance: " + getBalance(creditCardPaymentFactory));

        charge(gopayPaymentFactory);
        cancel(gopayPaymentFactory);
        System.out.println("Gopay balance: " + getBalance(gopayPaymentFactory));

        charge(bcaKlikpayPaymentFactory);
        cancel(bcaKlikpayPaymentFactory);
        System.out.println("Bca Klikpay balance: " + getBalance(bcaKlikpayPaymentFactory));
    }

    public void charge(PaymentFactory paymentFactory){
        ChargePaymentRequest chargePaymentRequest = paymentFactory.createChargePaymentRequest();
        chargePaymentRequest.setId("123");
        chargePaymentRequest.setAmount(1_000_000L);

        System.out.println("Charge payment request: " + chargePaymentRequest);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest cancelPaymentRequest = paymentFactory.createCancelPaymentRequest();
        cancelPaymentRequest.setId("123");

        System.out.println("Cancel payment request: " + cancelPaymentRequest);
    }

    public Long getBalance(PaymentFactory paymentFactory){
        try {
            GetBalancePaymentRequest getBalancePaymentRequest = paymentFactory.createGetBalancePaymentRequest();
            getBalancePaymentRequest.setUserId("Rezki");

            System.out.println("Get balance payment request: " + getBalancePaymentRequest);

            return 1000L;
        } catch (UnsupportedOperationException e){
            System.out.println("Get balance is not supported for this payment method");
            return 0L;
        }
    }

}