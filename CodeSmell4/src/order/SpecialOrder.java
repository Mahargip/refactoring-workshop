package order;

public class SpecialOrder extends Order {
    private String specialInstructions;

    public SpecialOrder(String customerName, double orderAmount, String specialInstructions) {
        super(customerName, orderAmount);
        this.specialInstructions = specialInstructions;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }
}
