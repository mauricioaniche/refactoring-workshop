package invoicegenerator;

import java.util.Arrays;

public class InvoiceGeneratorFactory {

	public InvoiceGenerator build() {

		return new InvoiceGenerator(Arrays.asList(
				new PersistInvoiceAction(new InvoiceRepository()),
				new SendInvoiceViaEmailAction()));
	}
}
