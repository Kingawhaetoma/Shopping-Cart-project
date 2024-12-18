import java.util.Scanner;

public class Menu {
    // Create a new Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);
    // Create instances of the Shop and Cart classes to interact with
        Shop shop = new Shop();
        Cart cart = new Cart();

    /**
     * Displays the main menu options and handles user input.
     * Loops until the user chooses to exit.
     */
    public void displayMenu(){
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    shop.displayProducts();
                    break;

                case 2:
                    System.out.print("Enter Product ID to add to cart: ");
                    String productId = scanner.nextLine();
                    Product productToAdd = shop.findProduct(productId);
                    if (productToAdd != null) {
                        System.out.print("Enter quantity to add: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        cart.addProduct(new Product(productToAdd.getProductId(), productToAdd.getProductName(), productToAdd.getPrice(), quantity), quantity);
                        System.out.println("Product added to cart.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to remove from cart: ");
                    String productIdToRemove = scanner.nextLine();
                    cart.removeProduct(productIdToRemove);
                    break;

                case 4:
                    cart.viewCart();
                    break;

                case 5:
                    System.out.println("\nCheckout Summary:");
                    cart.viewCart();
                    System.out.println("Total: $" + cart.calculateTotal());
                    running = false; // End program after checkout
                    break;

                case 6:
                    running = false; // Exit
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    displayMenu();
            }
        }

        System.out.println("Thank you for using the Shopping Cart Application!");
        scanner.close();
    }
}