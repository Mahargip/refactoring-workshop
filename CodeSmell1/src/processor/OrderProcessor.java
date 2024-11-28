package processor;

import order.Order;
import service.DiscountService;
import service.NotificationService;
import service.OrderValidator;

public class OrderProcessor {
    private OrderValidator validator;
    private DiscountService discountService;
    private NotificationService notificationService;

    public OrderProcessor() {
        this.validator = new OrderValidator();
        this.discountService = new DiscountService();
        this.notificationService = new NotificationService();
    }

    public void processOrder(Order order, String discountCode) {
        if (!validator.isValid(order)) {
            System.out.println("Invalid order");
            return;
        }

        double discount = discountService.applyDiscount(discountCode, order.getTotalPrice());
        double finalPrice = order.getTotalPrice() - discount;

        System.out.println("Order saved: " + order.getOrderId() + " with total: " + finalPrice);

        notificationService.sendNotification(order.getCustomer().getPhone(),
                "Your order has been processed with total: " + finalPrice);
    }
}
