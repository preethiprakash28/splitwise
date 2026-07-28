import java.util.ArrayList;
import java.util.Scanner;
public class SplitwiseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        System.out.println("===== Splitwise Console =====");
        System.out.println("Track shared expenses with friends.");
        System.out.println();
        System.out.println("Ready. More features coming in the next lessons.");
        boolean running = true;
        while (running) {
            System.out.println("===== Menu =====");
            System.out.println("1. Record Expense");
            System.out.println("2. Add Friend");
            System.out.println("3. List Friends");
            System.out.println("0. Quit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    if (friends.isEmpty()) {
                        System.out.println("No friends yet. Add friends first (option 2).");
                    } else {
                        System.out.print("Who paid? ");
                        String payerName = sc.nextLine();
                        System.out.print("Total Amount (₹): ");
                        double totalAmount = sc.nextDouble();
                        sc.nextLine();
                        int numFriends = friends.size();
                        double amountPerPerson = totalAmount / numFriends;
                        System.out.println();
                        System.out.println(payerName + " paid ₹" + totalAmount);
                        System.out.println("Each person pays: ₹" + amountPerPerson);
                        System.out.println();
                    }
                }
                case 2 -> {
                    addFriend(sc, friends);
                }
                case 3 -> {
                    if (friends.isEmpty()) {
                        System.out.println("No friends yet.");
                    } else {
                        System.out.println("Friends:");
                        for (String name : friends) {
                            System.out.println("- " + name);
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> {
                    System.out.println("Invalid Choice!");
                    System.out.println();
                }
            }
        }
    }
        public static void addFriend(Scanner sc,ArrayList<String>friends){
            System.out.print("Friend name:");
            String friendName = sc.nextLine();
            friends.add(friendName);
            System.out.println(friendName + "added successfully");
    }
}
