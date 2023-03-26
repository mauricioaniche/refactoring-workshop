package discountapplier;

import java.util.List;

//@Entity
public class DiscountProduct {

	private int id;
	private List<String> products;
	private double discount;

	public int getId() {
		return id;
	}

	public List<String> getProducts() {
		return products;
	}

	public double getDiscount() {
		return discount;
	}
}
