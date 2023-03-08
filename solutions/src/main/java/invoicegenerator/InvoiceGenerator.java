package invoicegenerator;

import java.util.List;

public class InvoiceGenerator {

    private final List<GeneratedInvoiceAction> actions;

    public InvoiceGenerator(List<GeneratedInvoiceAction> actions) {
        this.actions = actions;
    }

    public Invoice generate(ProvidedService providedService) {

        double amount = providedService.getMonthlyAmount();
        Invoice generatedInvoice = new Invoice(amount, simpleTax(amount));

        actions.forEach(action -> action.execute(generatedInvoice));

        return generatedInvoice;
    }

    private double simpleTax(double valor) {
        return valor * 0.06;
    }
}