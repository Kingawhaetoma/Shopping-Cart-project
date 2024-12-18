import org.junit.Test;

import static org.junit.Assert.*;


public class ProductTest {
    Product product = new Product("P001","Apple",0.99,100);

    @Test
    public void testGetProductId() {
        assertEquals("P001", product.getProductId());
    }

    @Test
    public void testGetProductName() {
        assertEquals("Apple", product.getProductName());
    }

    @Test
    public void testGetProductPrice() {
        assertEquals(0.99, product.getPrice());
    }

    @Test
    public void testGetProductQuantity() {
        assertEquals(100, product.getQuantity());
    }

}