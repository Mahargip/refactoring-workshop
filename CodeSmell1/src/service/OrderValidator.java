package service;

import order.Order;

public class OrderValidator {
    public boolean isValid(Order order) {
        if (order == null) {
            return false;
        }

        if (order.getTotalPrice() <= 0 || order.getMenuItems() == null || order.getMenuItems().isEmpty()) {
            return false;
        }

        return true;
    }
}
