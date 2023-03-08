package invoicegenerator;

public interface EmailSender {

    void sendEmail(Invoice invoice);
}