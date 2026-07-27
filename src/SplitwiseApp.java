public class SplitwiseApp {
    static void main() {
        System.out.println("===== Splitwise Console =====");
        System.out.println("Track shared expenses with friends.");
        System.out.println();
        System.out.println("Ready. More features coming in the next lessons. ");
        String payerName = "Riya";
        double totalAmount = 500.0;
        int numFrnds = 3;
        double amountPerPerson = totalAmount / numFrnds;
        String expense = payerName + "paid ₹" + totalAmount;
        String share = "Each person pays: ₹" + amountPerPerson;
        System.out.println(expense);
        System.out.println(share);
    }
}