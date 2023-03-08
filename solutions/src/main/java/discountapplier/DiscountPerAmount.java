package discountapplier;

import common.Basket;

public class DiscountPerAmount implements DiscountType {

    private final AmountCheck amount;
    private final QtyOfItemsCheck qtyOfItems;
    private final double discountPercentage;

    interface AmountCheck {
        boolean check(double amount);
    }
    interface QtyOfItemsCheck {
        boolean check(int qtyOfItems);
    }

    public DiscountPerAmount(AmountCheck amount, QtyOfItemsCheck qtyOfItems, double discountPercentage) {
        this.amount = amount;
        this.qtyOfItems = qtyOfItems;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean apply(Basket basket) {
        boolean matchesThisDiscount = amount.check(basket.getAmount()) && qtyOfItems.check(basket.qtyOfItems());
        if(matchesThisDiscount) {
            basket.subtract(basket.getAmount() * discountPercentage);
            return true;
        }

        return false;
    }
}
