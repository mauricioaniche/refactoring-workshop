package invoicegenerator;

public interface InvoiceRepository {
    void persist(Invoice invoice);
}