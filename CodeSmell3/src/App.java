import payment.BankTransferPayment;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import processor.PaymentProcessor;

public class App {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCardPayment creditCard = new CreditCardPayment();
        double creditCardTotal = processor.processPayment(creditCard, 100.0);
        System.out.println("Total setelah biaya: " + creditCardTotal);

        PayPalPayment paypal = new PayPalPayment();
        double paypalTotal = processor.processPayment(paypal, 100.0);
        System.out.println("Total setelah biaya: " + paypalTotal);

        BankTransferPayment bankTransfer = new BankTransferPayment();
        double bankTransferTotal = processor.processPayment(bankTransfer, 100.0);
        System.out.println("Total setelah biaya: " + bankTransferTotal);
    }
}
