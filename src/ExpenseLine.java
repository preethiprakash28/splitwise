public record ExpenseLine(String payerName, double amount) {

    public ExpenseLine {
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