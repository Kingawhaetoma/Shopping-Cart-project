Shopping Cart Application

Project Overview

The Shopping Cart Application is a simple command-line program that allows users to browse products, add items to their cart, view the cart, remove items, and check out. It provides an interactive menu that guides the user through various actions, simulating a basic e-commerce shopping experience.

The application is structured using object-oriented programming principles, with clearly defined classes to handle products, the shopping cart, and the user interface.

Key Features

View Products: Browse the available products in the store, including their product ID, name, price, and stock quantity.

Add Products to Cart: Select a product by its unique product ID and specify a quantity to add to the cart.

Remove Products from Cart: Remove a product from the cart by providing its product ID.

View Cart: View the contents of the cart, including product details and quantities.

Checkout: View a final summary of the items in the cart along with the total price, before ending the program.

Exit: Exit the application at any time.

Class Breakdown

1. Product Class

The Product class represents a product in the store.

Attributes: productId, productName, price, and quantity.

Methods:

Getters for product details (ID, name, price, quantity).

setQuantity() to update the stock quantity.

toString() to format product information for display.

2. Shop Class

The Shop class holds a list of available products.

Attributes:

productList: An ArrayList of Product objects.

Methods:

Constructor: Initializes the store with predefined products.

displayProducts(): Displays all available products.

findProduct(productId): Finds and returns a product by its unique ID.

3. Cart Class

The Cart class manages products added to the user's shopping cart.

Attributes:

cartItems: An ArrayList of Product objects representing the products in the cart.

Methods:

addProduct(product, quantity): Adds a product to the cart and increases the quantity if the product already exists in the cart.

removeProduct(productId): Removes a product from the cart by its product ID.

viewCart(): Displays all items in the cart along with their quantity and price.

calculateTotal(): Calculates the total price of items in the cart.

4. Menu Class

The Menu class provides an interactive user interface.

Attributes:

scanner: A Scanner object to capture user input.

shop: An instance of the Shop class.

cart: An instance of the Cart class.

Methods:

displayMenu(): Displays the main menu with six options:

View Products

Add Product to Cart

Remove Product from Cart

View Cart

Checkout

Exit

Based on the user's choice, the program performs actions like adding or removing products, viewing the cart, or checking out.

5. Main Class

The Main class is the entry point of the program.

Methods:

main(): Initializes a Menu object and calls menu.displayMenu() to start the interactive menu.

Usage Instructions

Run the Program: Compile and run the Main.java file.

Menu Navigation: Follow the prompts to select actions by typing the corresponding number (1-6).

View Products: Displays a list of all available products in the store.

Add Products: Enter the product ID and quantity of the product to add it to the cart.

Remove Products: Enter the product ID of the item to remove it from the cart.

View Cart: View all items currently in the cart, along with their total price.

Checkout: View a final summary of your cart before exiting the program.

Exit: Exit the application.

SAMPLE INTERACTION
Choose an option:
1. View Products
2. Add Product to Cart
3. Remove Product from Cart
4. View Cart
5. Checkout
6. Exit

Enter your choice: 1

Available Products:
1. Product ID: P001, Name: Apple, Price: $0.99, Available: 100
2. Product ID: P002, Name: Banana, Price: $0.59, Available: 150
3. Product ID: P003, Name: Headphones, Price: $49.99, Available: 20
4. Product ID: P004, Name: Laptop, Price: $899.99, Available: 10
5. Product ID: P005, Name: Mouse, Price: $19.99, Available: 50

Choose an option:
1. View Products
2. Add Product to Cart
3. Remove Product from Cart
4. View Cart
5. Checkout
6. Exit

Enter your choice: 2
Enter Product ID to add to cart: P001
Enter quantity to add: 3
Product added to cart.

Choose an option:
1. View Products
2. Add Product to Cart
3. Remove Product from Cart
4. View Cart
5. Checkout
6. Exit

Enter your choice: 4

Your Cart:
1. Product ID: P001, Name: Apple, Price: $0.99, Quantity: 3
Total: $2.97

Choose an option:
1. View Products
2. Add Product to Cart
3. Remove Product from Cart
4. View Cart
5. Checkout
6. Exit

Enter your choice: 5

Checkout Summary:
1. Product ID: P001, Name: Apple, Price: $0.99, Quantity: 3
Total: $2.97

Thank you for using the Shopping Cart Application!

Possible Enhancements

Data Persistence: Save cart data to a file to allow resuming previous sessions.

Error Handling: Handle invalid inputs gracefully, like non-integer choices or negative quantities.

User Authentication: Allow users to log in and track their shopping history.

Graphical User Interface (GUI): Replace the command-line interface with a graphical interface for better user experience.

Conclusion

The Shopping Cart Application provides a user-friendly shopping experience in the terminal. With features for browsing products, managing a cart, and checking out, it demonstrates core principles of object-oriented programming, user input handling, and console-based interaction.

This project can be extended with additional features like file I/O, database integration, and graphical interfaces to create a more comprehensive shopping application.

