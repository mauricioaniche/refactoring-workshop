package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountPerProduct implements DiscountStrategy {

	private final List<String> products;
	private final double discount;

	public DiscountPerProduct(List<String> products, double discount) {
		this.products = products;
		this.discount = discount;
	}

	@Override
	public boolean shouldBeApplied(Basket basket) {
		boolean allProductsAreInTheBasket = products.stream().allMatch(product -> basket.has(product));
		return allProductsAreInTheBasket;
	}

	@Override
	public void apply(Basket basket) {
		basket.applyDiscountByPercentage(discount);
	}
}
