package service;

public class DiscountService {
    public double applyDiscount(String discountCode, double totalPrice) {
        if ("DISC10".equals(discountCode)) {
            return totalPrice * 0.10;
        } else if ("DISC20".equals(discountCode)) {
            return totalPrice * 0.20;
        }
        return 0;
    }
}
