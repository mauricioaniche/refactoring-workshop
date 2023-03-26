package invoicegenerator;

import java.util.List;

public class InvoiceGenerator {

    private List<InvoiceGeneratedAction> actions;

    public InvoiceGenerator(List<InvoiceGeneratedAction> actions) {
        this.actions = actions;
    }

    public Invoice generate(ProvidedService providedService) {

        double amount = providedService.getMonthlyAmount();

        Invoice invoice = new Invoice(amount, simpleTax(amount));

        for (InvoiceGeneratedAction action : actions) {
            action.process(invoice);
        }

        return invoice;
    }

    private double simpleTax(double value) {
        return value * 0.06;
    }
}
