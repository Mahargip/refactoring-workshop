import order.Order;
import order.SpecialOrder;
import order.OrderPrinter;

public class Main {
    public static void main(String[] args) {
        Order regularOrder = new Order("Alice", 100.0);
        
        SpecialOrder specialOrder = new SpecialOrder("Bob", 150.0, "Handle with care");

        OrderPrinter printer = new OrderPrinter();
        printer.printOrderDetails(regularOrder);
        System.out.println();
        printer.printOrderDetails(specialOrder);
    }
}
