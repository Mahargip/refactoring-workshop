package payment;

import repositories.BasePaymentRepository;

public class BankTransferPayment implements BasePaymentRepository {
    @Override
    public double calculateFee(double amount) {
        return 0.01 * amount; 
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer...");
    }
}
