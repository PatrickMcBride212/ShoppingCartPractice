import main.Item;
import main.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class ShoppingCartTests {
    @Test
    public void ShoppingCartInitializeTest() {
        ShoppingCart cart = new ShoppingCart();
        Assert.assertTrue("Shopping Cart Hashmap should be initialized to null", cart.getItems().isEmpty());
    }

    @Test
    public void AddItemsSubtotalTest() {
        ShoppingCart cart = new ShoppingCart();
        Item tofu = new Item("Tofu", 5.99);
        cart.addItem(tofu);
        Assert.assertEquals(tofu.getItemPrice(), cart.getSubtotal(), 0.01);
    }

    @Test
    public void ManyItemsAndCountTest() {
        ShoppingCart cart = new ShoppingCart();
        Item tofu = new Item("Tofu", 5.99);
        Item sushi = new Item("Sushi", 10.99);
        double rightTotal = 0;

        cart.addItem(tofu);
        rightTotal += tofu.getItemPrice();
        Assert.assertEquals(rightTotal, cart.getSubtotal(), 0.01);
        int tofuCount = cart.getItems().get(tofu);
        Assert.assertEquals(1, tofuCount);

        cart.addItem(sushi);
        rightTotal += sushi.getItemPrice();
        Assert.assertEquals(rightTotal, cart.getSubtotal(), 0.01);
        int sushiCount = cart.getItems().get(sushi);
        Assert.assertEquals(1, sushiCount);

        cart.addItem(tofu);
        rightTotal += tofu.getItemPrice();
        Assert.assertEquals(rightTotal, cart.getSubtotal(), 0.01);
        tofuCount = cart.getItems().get(tofu);
        Assert.assertEquals(2, tofuCount);
    }

    @Test
    public void viewItemsTest() {
        ShoppingCart cart = new ShoppingCart();
        Item tofu = new Item("Tofu", 5.99);
        Item sushi = new Item("Sushi", 10.99);
        Item rice = new Item("Rice", 2.99);

        cart.addItem(tofu);
        cart.addItem(tofu);
        cart.addItem(tofu);
        cart.addItem(sushi);
        cart.addItem(sushi);
        cart.addItem(rice);

        cart.viewItems();
    }
}
