public record ExpenseLine(String payerName, double amount) {

    public ExpenseLine {
        if (amount < 0) {
            amount = 0;
        }
    }

    public double perpersonshare(int numFriends) {
        return amount / numFriends;
    }
}