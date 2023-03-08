package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountApplier {

    private final List<DiscountType> discounts;

    public DiscountApplier(List<DiscountType> discounts) {
        this.discounts = discounts;
    }

    public void apply(Basket basket) {
        for (DiscountType discount : discounts) {
            boolean discountApplied = discount.apply(basket);
            if(discountApplied)
                break;
        }
    }
}