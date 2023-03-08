package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountPerProduct implements DiscountType {

    private final List<String> productsInTheBasket;
    private final double discount;

    public DiscountPerProduct(List<String> productsInTheBasket, double discount) {
        this.productsInTheBasket = productsInTheBasket;
        this.discount = discount;
    }

    @Override
    public boolean apply(Basket basket) {

        boolean allProductsAreInTheBasket = productsInTheBasket
                .stream()
                .map(product -> basket.has(product))
                .anyMatch(inTheBasket -> inTheBasket == false);

        if(allProductsAreInTheBasket) {
            basket.subtract(basket.getAmount() * discount);
            return true;
        }

        return false;

    }
}
