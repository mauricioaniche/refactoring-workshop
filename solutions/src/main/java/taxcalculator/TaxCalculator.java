package taxcalculator;

public class TaxCalculator {

    private final TaxIdentifier identifier;

    public TaxCalculator(TaxIdentifier identifier) {
        this.identifier = identifier;
    }

    public double calculateTax(Employee employee) {
        // ... bigger business rule here ...

        TaxStrategy taxStrategy = identifier.getStrategy(employee);
        double taxToPay = taxStrategy.calculate(employee);

        // .. continue here ...
        return taxToPay;
    }

}