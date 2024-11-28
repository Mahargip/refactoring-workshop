package order;

public class OrderPrinter {
    public void printOrderDetails(Order order) {
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Amount: $" + order.getOrderAmount());
        
        if (order instanceof SpecialOrder) {
            SpecialOrder specialOrder = (SpecialOrder) order;
            System.out.println("Special Instructions: " + specialOrder.getSpecialInstructions());
        }
    }
}
