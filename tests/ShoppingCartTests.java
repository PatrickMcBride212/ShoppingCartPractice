import main.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTests {
    @Test
    public void ShoppingCartInitializeTest() {
        ShoppingCart cart = new ShoppingCart();
        Assert.assertTrue("Shopping Cart Hashmap should be initialized to null", cart.getItems().isEmpty());
    }
}
