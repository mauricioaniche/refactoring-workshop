package paymentprocessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Billing {

    private List<Payment> payments = new ArrayList<>();

    public List<Payment> getPayments() {
        return Collections.unmodifiableList(payments);
    }

    public void addPayment(Payment payment) {

        // new rule, you implement here!
        if(payments.size() > 10)
            throw new RuntimeException("Maximum number of payments reached!");

        this.payments.add(payment);
    }
}
