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
}
