import java.util.ArrayList;
import java.util.Scanner;

public class SplitwiseApp {

    public static void main(String[] args) {

        System.out.println("=== SplitWise ===");
        System.out.println("Track shared expenses with friends.");
        System.out.println();

        Scanner input = new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("\n=== Menu ===");
            System.out.println("1. Record Expense");
            System.out.println("2. Add Friend");
            System.out.println("3. List Friends");
            System.out.println("0. Quit");
            System.out.print("Choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1 -> {

                    if (friends.isEmpty()) {
                        System.out.println("No friends added yet.");
                    } else {

                        System.out.print("Who paid? ");
                        String payerName = input.nextLine();

                        System.out.print("Total Amount: ");
                        double totalAmount = input.nextDouble();
                        input.nextLine();

                        int numFriends = friends.size();

                        ExpenseLine obj = new ExpenseLine(payerName, totalAmount);

                        double perPersonShare = obj.perpersonshare(numFriends);

                        System.out.println(obj.payerName() + " paid " + obj.amount());
                        System.out.printf("Each person pays: %.2f%n", perPersonShare);
                    }
                }

                case 2 -> addFriend(input, friends);

                case 3 -> {

                    if (friends.isEmpty()) {
                        System.out.println("No friends added.");
                    } else {

                        System.out.println("Friends:");

                        for (Friend f : friends) {
                            System.out.println(f.getId() + " - " + f.getName());
                        }
                    }
                }

                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }

                default -> System.out.println("Invalid Choice!");
            }
        }

        input.close();
    }

    public static void addFriend(Scanner input, ArrayList<Friend> friends) {

        System.out.print("Friend name: ");
        String friendName = input.nextLine();

        Friend f = new Friend(friendName);
        friends.add(f);

        System.out.println("Added " + f.getName() + " (id " + f.getId() + ").");
    }
}