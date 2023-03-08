package paymentprocessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Billing {

    private List<Payment> payments = new ArrayList<>();

    public List<Payment> getPayments() {
        // the return here is immutable now
        return Collections.unmodifiableList(payments);
    }

    public void addPayment(Installment installment) {
        Payment payment = new Payment(installment.getAmount());
        this.payments.add(payment);
    }
}
