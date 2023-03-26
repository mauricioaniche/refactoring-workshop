package invoicegenerator;

public class PersistInvoiceAction implements InvoiceGeneratedAction {

	private InvoiceRepository repository;

	public PersistInvoiceAction(InvoiceRepository repository) {
		this.repository = repository;
	}
	@Override
	public void process(Invoice invoice) {
		repository.persist(invoice);
		// ...
	}
}
