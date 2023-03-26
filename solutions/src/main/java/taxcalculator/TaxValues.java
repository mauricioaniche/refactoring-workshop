package taxcalculator;

public class TaxValues {

	private final double threshold;
	private final double aboveTax;
	private final double belowTax;

	public TaxValues(double threshold, double aboveTax, double belowTax) {
		this.threshold = threshold;
		this.aboveTax = aboveTax;
		this.belowTax = belowTax;
	}

	public double getThreshold() {
		return threshold;
	}

	public double getAboveTax() {
		return aboveTax;
	}

	public double getBelowTax() {
		return belowTax;
	}
}
