package main;

import java.util.HashMap;

public class ShoppingCart {
    private double subtotal;
    private HashMap<Item, Integer> Items;

    public ShoppingCart() {
        this.subtotal = 0;
        Items = new HashMap<>();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public HashMap<Item, Integer> getItems() {
        return Items;
    }

    public void addItem(Item item) {
        if (Items.containsKey(item)) {
            int count = Items.get(item);
            count++;
            Items.put(item, count);
        } else {
            Items.put(item, 1);
        }
        subtotal = subtotal + item.getItemPrice();
    }
}
