package discountapplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierFactory {

	private DiscountRepository repository;

	public DiscountApplierFactory(DiscountRepository repository) {
		this.repository = repository;
	}

	public DiscountApplier build() {

		List<DiscountStrategy> discounts = new ArrayList<>();

		List<DiscountProduct> allDiscountsPerProduct = repository.getAllDiscountsPerProduct();

		for (DiscountProduct discountProduct : allDiscountsPerProduct) {
			discounts.add(new DiscountPerProduct(discountProduct.getProducts(), discountProduct.getDiscount()));
		}

		List<DiscountAmount> allDiscountsPerAmount = repository.getAllDiscountsPerAmount();

		for (DiscountAmount discountAmount : allDiscountsPerAmount) {
			discounts.add(new DiscountPerAmount(discountAmount.getMinAmount(), discountAmount.getMaxAmount(),
					discountAmount.getMinItems(), discountAmount.getMaxItems(), discountAmount.getDiscount()));
		}

		return new DiscountApplier(discounts);
	}
}
