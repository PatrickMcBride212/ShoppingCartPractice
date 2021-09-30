import main.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTests {
    @Test
    public void ShoppingCartTest() {
        ShoppingCart cart = new ShoppingCart();
        Assert.assertNull("Shopping Cart Hashmap should be initialized to null", cart.getItems());
    }
}
