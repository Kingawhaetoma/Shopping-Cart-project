import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> productList;

    // Constructor - manually add products to the product list

    /**
     * Constructor - Initializes the product list and adds sample products.
     */
    public Shop() {
        this.productList = new ArrayList<>();
        productList.add(new Product("P001", "Apple", 0.99, 100));
        productList.add(new Product("P002", "Banana", 0.59, 150));
        productList.add(new Product("P003", "Headphones", 49.99, 20));
        productList.add(new Product("P004", "Laptop", 899.99, 10));
        productList.add(new Product("P005", "Mouse", 19.99, 50));
    }

    // Display available products

    /**
     * Displays available products
     */
    public void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ". " + productList.get(i));
        }
    }

    // Find a product by product ID

    /**
     * finds a product by the ID
     * @param productId
     * @return
     */
    public Product findProduct(String productId) {
        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null; // Return null if the product is not found
    }
}
