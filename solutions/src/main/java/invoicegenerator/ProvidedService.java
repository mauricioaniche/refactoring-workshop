package invoicegenerator;

public class ProvidedService {

    private double monthlyAmount;
    private String customer;

    public ProvidedService() {}

    public ProvidedService(double monthlyAmount, String customer) {
        this.monthlyAmount = monthlyAmount;
        this.customer = customer;
    }
    public double getMonthlyAmount() {
        return monthlyAmount;
    }
    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }


}