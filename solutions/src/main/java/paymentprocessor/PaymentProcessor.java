package paymentprocessor;

import java.util.List;

public class PaymentProcessor {

    public void process(List<Installment> installments, Billing billing) {
        for(Installment installment : installments) {
            Payment payment = new Payment(installment.getAmount());

            billing.addPayment(payment);
        }
    }

}
