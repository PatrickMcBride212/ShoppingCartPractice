import main.Item;
import main.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

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
}
