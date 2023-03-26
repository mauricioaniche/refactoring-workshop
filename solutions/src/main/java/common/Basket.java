package common;

import java.util.List;

public class Basket {

    private double amount;
    private List<Item> items;

    public Basket(List<Item> itemss) {
        this.items = itemss;
        sumItems();
    }

    private void sumItems() {
        for(Item item : items) {
            amount += item.getTotalPrice();
        }

    }

    /**
     * Aplica desconto baseado em porcentagem.
     * Se a porcentagem de desconto for invalida, nenhum desconto é aplicado.
     *
     * @param discountPercentage porcentagem, [0.0, 1.0]
     */
    public void applyDiscountByPercentage(double discountPercentage) {
        if(discountPercentage < 0 || discountPercentage > 1) {
            //throw new IllegalArgumentException("Invalid discount percentage");
            return;
        }

        this.amount -= this.amount * discountPercentage;
    }

    public double getAmount() {
        return amount;
    }

    public int qtyOfItems() {
        int qty = 0;
        for(Item item : items) {
            qty+= item.getQty();
        }
        return qty;
    }

    public boolean has(String product) {
        for(Item item : items) {
            if(item.getName().equals(product)) return true;
        }

        return false;
    }

}