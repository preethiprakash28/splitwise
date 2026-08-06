/**
 * Represents one expense row containing the payer and the amount.
 *
 * @param payerName the name of the friend who paid
 * @param amount the amount paid
 */

public record ExpenseLine(String payerName, double amount) {

    public ExpenseLine {
        // Compact constructor to reject negative amount
        if (amount < 0) {
            amount = 0;
        }
    }

    public double perpersonshare(int numFriends) {
        if (numFriends == 0) {
            return 0;
        }
        return amount / numFriends;
    }

    public ExpenseLine(double amount) {
        this("unknown", amount);
    }
}