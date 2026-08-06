public class Expense {

    private String payerName;
    private double amount;

    public Expense(String payerName, double amount) {
        this.payerName = payerName;
        this.amount = amount;
    }

    public String getPayerName() {
        return payerName;
    }

    public double getAmount() {
        return amount;
    }
}