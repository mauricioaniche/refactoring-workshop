package taxcalculator;

public class TaxCalculator {

    private TaxCalculationResolver resolver;

    public TaxCalculator(TaxCalculationResolver resolver) {
        this.resolver = resolver;
    }
    public double calculateTax(Employee employee) {
        TaxCalculationStrategy strategy = resolver.forRole(employee.getRole());
        return strategy.calculate(employee);
    }

}