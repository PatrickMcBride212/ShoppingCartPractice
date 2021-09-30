package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

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

    public void viewItems() {
        LinkedList<Item> items = new LinkedList<>(Items.keySet());
        LinkedList<Integer> counts = new LinkedList<>(Items.values());

        Iterator<Item> itemIterator = items.iterator();
        Iterator<Integer> countsIterator = counts.iterator();

        while (itemIterator.hasNext()) {
            Item currentItem = itemIterator.next();
            System.out.printf("Item: %s\n", currentItem.getItemName());
            System.out.printf("Price: %.2f\n", currentItem.getItemPrice());
            System.out.printf("Count: %d\n", countsIterator.next());
            System.out.println("=====");
        }
        System.out.printf("Subtotal: %.2f\n", subtotal);
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
