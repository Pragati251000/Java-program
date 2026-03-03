package Ecommerce;

// Product class
class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

// Customer class
class Customer {
    String name;

    Customer(String n) {
        name = n;
    }

    void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}

// Order class
class Order {
    Product product;
    int quantity;

    Order(Product p, int q) {
        product = p;
        quantity = q;
    }

    void placeOrder() {
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (product.price * quantity));
    }
}

// Main class
public class EcommerceTest {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Amit");
        Order o = new Order(p, 2);

        System.out.println("---- Customer Details ----");
        c.displayCustomer();

        System.out.println("---- Order Details ----");
        o.placeOrder();
    }
}