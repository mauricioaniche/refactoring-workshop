package taxcalculator;

public class ThresholdBasedTax implements TaxStrategy {

    private final double baseSalaryThreshold;
    private final double taxIfAboveThreshold;
    private final double taxIfBelowThreshold;

    public ThresholdBasedTax(double baseSalaryThreshold, double taxIfAboveThreshold, double taxIfBelowThreshold) {

        this.baseSalaryThreshold = baseSalaryThreshold;
        this.taxIfAboveThreshold = taxIfAboveThreshold;
        this.taxIfBelowThreshold = taxIfBelowThreshold;
    }
    @Override
    public double calculate(Employee employee) {
        return employee.getBaseSalary() > baseSalaryThreshold ? taxIfAboveThreshold : taxIfBelowThreshold;
    }
}
