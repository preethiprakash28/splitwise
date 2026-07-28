import java.util.Scanner;
public class SplitwiseApp {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("===== Splitwise Console =====");
        System.out.println("Track shared expenses with friends.");
        System.out.println();
        System.out.println("Ready. More features coming in the next lessons. ");
        boolean running = true;
        while(running){
            System.out.println("==== Main Menu ====");
            System.out.println("1. Record expense");
            System.out.println("0. Quit");
            System.out.println("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1 -> {
                    System.out.println("Enter Payer Name:");
                    String payerName = sc.nextLine();
                    System.out.println("Enter Total Amount:");
                    double totalAmount = sc.nextDouble();
                    sc.nextLine();
                    int numFrnds = 3;
                    double amountPerPerson = totalAmount / numFrnds;
                    String expense = payerName + " paid ₹" + totalAmount;
                    String share = "Each person pays : ₹" + amountPerPerson;
                    System.out.println(expense);
                    System.out.println(share);
                    System.out.println();
                }
                case 0 ->{
                    System.out.println("Goodbye!!!!!");
                    running = false;
                }
                default ->{
                    System.out.println("Invalid choice. Try again.");
                    System.out.println();
                }
            }
        }
    }
}