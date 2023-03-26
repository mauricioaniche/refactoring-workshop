package discountapplier;

public class DiscountAmount {

	private int id;

	private int minItems;
	private int maxItems;
	private double minAmount;
	private double maxAmount;

	private double discount;

	public double getDiscount() {
		return discount;
	}

	public double getMaxAmount() {
		return maxAmount;
	}

	public int getMaxItems() {
		return maxItems;
	}

	public double getMinAmount() {
		return minAmount;
	}

	public int getMinItems() {
		return minItems;
	}
}
