package discountapplier;

import common.Basket;

public interface DiscountType {
    boolean apply(Basket basket);
}
