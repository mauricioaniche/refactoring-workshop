package discountapplier;

import common.Basket;

public class DiscountPerAmount implements DiscountStrategy {

	private final double minimumAmount;
	private final double maximumAmount;
	private final int minNoOfItems;
	private final int maxNoOfItems;
	private final double discount;

	public DiscountPerAmount(double minimumAmount, double maximumAmount, int minNoOfItems, int maxNoOfItems,
	                         double discount) {
		this.minimumAmount = minimumAmount;
		this.maximumAmount = maximumAmount;
		this.minNoOfItems = minNoOfItems;
		this.maxNoOfItems = maxNoOfItems;
		this.discount = discount;
	}

	@Override
	public boolean shouldBeApplied(Basket basket) {
		int qtyOfItems = basket.qtyOfItems();
		double amount = basket.getAmount();

		boolean withinItemsLimit = qtyOfItems >= minNoOfItems && qtyOfItems <= maxNoOfItems;
		boolean withinAmountLimit = amount >= minimumAmount && amount <= maximumAmount;

		return withinItemsLimit && withinAmountLimit;
	}

	public void apply(Basket basket) {
		basket.applyDiscountByPercentage(discount);
	}
}
