package invoicegenerator;

public class Invoice {

    private int id;
    private double rawAmount;
    private double taxes;

    public Invoice(int id, double rawAmount, double taxes) {
        this.id = id;
        this.rawAmount = rawAmount;
        this.taxes = taxes;
    }

    public Invoice(double rawAmount, double taxes) {
        this(0, rawAmount, taxes);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getRawAmount() {
        return rawAmount;
    }
    public void setRawAmount(double rawAmount) {
        this.rawAmount = rawAmount;
    }
    public double getTaxes() {
        return taxes;
    }
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getValorLiquido() {
        return this.rawAmount - this.taxes;
    }

}