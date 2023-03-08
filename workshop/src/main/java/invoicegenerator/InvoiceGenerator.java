package invoicegenerator;

public class InvoiceGenerator {

    private final EmailSender email;
    private final InvoiceRepository dao;

    public InvoiceGenerator(EmailSender email, InvoiceRepository dao) {
        this.email = email;
        this.dao = dao;
    }

    public Invoice generate(ProvidedService providedService) {

        double amount = providedService.getMonthlyAmount();

        Invoice nf = new Invoice(amount, simpleTax(amount));

        email.sendEmail(nf);
        dao.persist(nf);

        return nf;
    }

    private double simpleTax(double valor) {
        return valor * 0.06;
    }
}