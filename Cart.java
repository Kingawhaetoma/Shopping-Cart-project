import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartItems;

    // Constructor
    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    // Add a product to the cart

    /**
     * Add a product to the cart
     * @param product
     * @param quantity
     */
    public void addProduct(Product product, int quantity) {
        product.setQuantity(quantity); // Set quantity for the product being added
        cartItems.add(product); // Add the product to the cart
    }

    // Remove a product from the cart using product ID

    /**
     * Remove a product from the cart using product ID
     * @param productId
     */
    public void removeProduct(String productId) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getProductId().equals(productId)) {
                cartItems.remove(i);
                System.out.println("Product removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    // View products in the cart

    /**
     * View products in the cart
     */
    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("\nYour Cart:");
            for (Product product : cartItems) {
                System.out.println(product.getProductName() + " x " + product.getQuantity() + " ($" + (product.getPrice() * product.getQuantity()) + ")");
            }
        }
    }

    // Calculate total cost of items in the cart

    /**
     * Calculates the total cost of all items in the cart.
     * @return
     */
    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}
