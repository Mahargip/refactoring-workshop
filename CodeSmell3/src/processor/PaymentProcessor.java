package processor;

import repositories.BasePaymentRepository;

public class PaymentProcessor {
    public double processPayment(BasePaymentRepository paymentMethod, double amount) {
        paymentMethod.processPayment();
        double fee = paymentMethod.calculateFee(amount);
        return amount + fee;
    }
}
