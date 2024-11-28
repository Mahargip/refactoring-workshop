import model.Customer;
import model.Order;
import processor.OrderProcessor;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "1234567890", "123 Street Name");

        Order order = new Order("ORD123", customer, Arrays.asList("Burger", "Fries"), 100.0);

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order, "DISC10");
    }
}
