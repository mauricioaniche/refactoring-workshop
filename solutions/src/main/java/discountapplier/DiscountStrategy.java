package discountapplier;

import common.Basket;

public interface DiscountStrategy {
	boolean shouldBeApplied(Basket basket);

	void apply(Basket basket);
}
