import java.util.Scanner;
public class SplitwiseApp {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("===== Splitwise Console =====");
        System.out.println("Track shared expenses with friends.");
        System.out.println();
        System.out.println("Ready. More features coming in the next lessons. ");
        System.out.println("Enter Payer Name:");
        String payerName = sc.nextLine();
        System.out.println("Enter Total Amount:");
        double totalAmount = sc.nextDouble();
        int numFrnds = 3;
        double amountPerPerson = totalAmount / numFrnds;
        String expense = payerName + " paid ₹" + totalAmount;
        String share = "Each person pays: ₹" + amountPerPerson;
        System.out.println(expense);
        System.out.println(share);
    }
}