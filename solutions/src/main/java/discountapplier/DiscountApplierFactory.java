package discountapplier;

import java.util.Arrays;

public class DiscountApplierFactory {

    /**
     * You may want to get this data from the DB!!
     */
    public DiscountApplier create() {

        return new DiscountApplier(Arrays.asList(
                // discounts per product
                new DiscountPerProduct(Arrays.asList("MACBOOK", "IPHONE"), 0.15),
                new DiscountPerProduct(Arrays.asList("NOTEBOOK", "WINDOWS PHONE"), 0.12),
                new DiscountPerProduct(Arrays.asList("XBOX"), 0.7),

                // discounts per amount
                new DiscountPerAmount(amount -> amount <= 1000, qty -> qty <= 2, 0.02),
                new DiscountPerAmount(amount -> amount > 3000, qty -> qty < 5 && qty > 2, 0.05),
                new DiscountPerAmount(amount -> amount < 3000, qty -> qty >= 5, 0.06)
        ));

    }
}
