public record ExpenseLine(String payerName, double amount)
{
    public ExpenseLine
    {
        // Compact constructor to reject negative amount
        if (amount < 0)
        {
            amount = 0;
        }
    }

    public double perpersonshare(int numfriends)
    {
        return amount / numfriends;
    }

    public ExpenseLine(double amount)
    {
        this("unknown", amount);
    }
}