package taxcalculator;

public class ThresholdBasedTaxCalculation implements TaxCalculationStrategy {
	private final double threshold;
	private final double aboveTheThresholdTax;
	private final double belowTheThresholdTax;

	public ThresholdBasedTaxCalculation(double threshold, double aboveTheThresholdTax, double belowTheThresholdTax) {
		this.threshold = threshold;
		this.aboveTheThresholdTax = aboveTheThresholdTax;
		this.belowTheThresholdTax = belowTheThresholdTax;
	}

	@Override
	public double calculate(Employee employee) {
		if(employee.getBaseSalary() > threshold) {
			return employee.getBaseSalary() * aboveTheThresholdTax;
		}
		else {
			return employee.getBaseSalary() * belowTheThresholdTax;
		}
	}
}
