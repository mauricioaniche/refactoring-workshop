package taxcalculator;

import static taxcalculator.Role.*;

public class TaxCalculator {

    public double calculateTax(Employee employee) {
        if(DEVELOPER.equals(employee.getRole())) {
            return tenOrTwentyPercent(employee);
        }

        if(DBA.equals(employee.getRole()) || TESTER.equals(employee.getRole())) {
            return fifteenOrTwentyFivePercent(employee);
        }

        // ... and many more ...

        throw new RuntimeException("invalid employee");
    }

    private double tenOrTwentyPercent(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.8;
        }
        else {
            return employee.getBaseSalary() * 0.9;
        }
    }

    private double fifteenOrTwentyFivePercent(Employee employee) {
        if(employee.getBaseSalary() > 2000.0) {
            return employee.getBaseSalary() * 0.75;
        }
        else {
            return employee.getBaseSalary() * 0.85;
        }
    }

}