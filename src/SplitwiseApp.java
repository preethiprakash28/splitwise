import java.util.ArrayList;
import java.util.Scanner;

/**
 * Splitwise console application.
 */
public class SplitwiseApp {

    /**
     * Starts the Splitwise console application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("=== SplitWise ===");
        System.out.println("Track shared expenses with friends.");
        System.out.println();
        System.out.println("Ready. More features coming in the next lessons.");

        Scanner input = new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("=== Menu ===");
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
                        System.out.println("No friends added yet");
                    } else {

                        System.out.print("Who paid? ");
                        String payerName = input.nextLine();

                        System.out.print("Total Amount ? ");
                        double totalAmount = input.nextDouble();
                        input.nextLine();

                        int numFriends = friends.size();

                        ExpenseLine obj = new ExpenseLine(payerName, totalAmount);

                        double perPersonShare = obj.perpersonshare(numFriends);

                        String expenseLine =
                                "%s paid %.2f".formatted(obj.payerName(), obj.amount());

                        String shareLine =
                                "Each person pays: %.2f".formatted(perPersonShare);

                        System.out.println(expenseLine);
                        System.out.println(shareLine);
                    }
                }

                case 2 -> addfriend(input, friends);

                case 3 -> {

                    if (friends.isEmpty()) {
                        System.out.println("No friend yet.");
                    } else {
                        System.out.println("Friends(id):");

                        for (Friend name : friends) {
                            System.out.println(FriendDisplay.listLine(name));
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

    public static void addfriend(Scanner input, ArrayList<Friend> friends) {

        System.out.print("Friend name: ");
        String friendName = input.nextLine();

        Friend f = new Friend(friendName);
        friends.add(f);

        System.out.println(FriendDisplay.addedMessage(f));
    }

    private static class FriendDisplay {

        static String listLine(Friend friend) {
            return "- %d: %s".formatted(friend.getId(), friend.getName());
        }

        static String addedMessage(Friend friend) {
            return "Added %s (id %d).".formatted(friend.getName(), friend.getId());
        }
    }
}