package taxcalculator;

public class TaxIdentifier {

    public TaxStrategy getStrategy(Employee employee) {
        // this will probably come from a DB
        switch(employee.getRole()) {
            case DBA:
                return new ThresholdBasedTax(2000, 0.75, 0.85);
            case DEVELOPER:
                return new ThresholdBasedTax(3000, 0.65, 0.55);
            default:
                return new ThresholdBasedTax(5000, 0.65, 0.55);
        }
    }
}
