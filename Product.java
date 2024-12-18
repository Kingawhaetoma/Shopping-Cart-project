public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor

    /**
     *Constructor to create a new Product object.
     * @param productId Unique identifier for the product
     * @param productName Name of the product
     * @param price The price of a single unit of the product. Must be a positive double
     * @param quantity Initial stock quantity of the product. Must be a non-negative integer
     */
    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters

    /**
     * returns the ID number of product
     * @return
     */
    public String getProductId() {
        return productId;
    }

    /**
     * return name of product
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * return the price of product
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * return quantity of product
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display product details

    /**
     * Returns a string representation of the product's details.
     * @return
     */
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + price + ", Available: " + quantity;
    }
}
