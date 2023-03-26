package taxcalculator;

public class TaxCalculationResolver {

	private TaxStrategiesRepository repository;

	public TaxCalculationResolver(TaxStrategiesRepository repository) {
		this.repository = repository;
	}
	public TaxCalculationStrategy forRole(Role role) {
		TaxValues taxValues = repository.getForRole(role);

		return new ThresholdBasedTaxCalculation(taxValues.getThreshold(),
				taxValues.getAboveTax(),
				taxValues.getBelowTax());
	}
}
