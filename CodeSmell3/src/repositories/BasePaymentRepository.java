package repositories;

public interface BasePaymentRepository {
    double calculateFee(double amount);
    void processPayment();
}
