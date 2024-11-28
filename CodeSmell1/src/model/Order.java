package model;

import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<String> menuItems;
    private double totalPrice;

    public Order(String orderId, Customer customer, List<String> menuItems, double totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.menuItems = menuItems;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
