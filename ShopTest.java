import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {
    Shop shop = new Shop();

    @Test
    public void testFindProduct_ProductExists() {
        Product product = shop.findProduct("P001");
    }



}