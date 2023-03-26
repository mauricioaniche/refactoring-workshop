package taxcalculator;

public interface TaxStrategiesRepository {

	TaxValues getForRole(Role role);
}
