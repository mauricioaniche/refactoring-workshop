package discountapplier;

import java.util.List;

public interface DiscountRepository {
	List<DiscountProduct> getAllDiscountsPerProduct();

	List<DiscountAmount> getAllDiscountsPerAmount();

	// ....
}
