import java.util.ArrayList;
import java.util.Scanner;

public class SplitwiseApp
{
    public static void main(String[] args)
    {
        System.out.println("=== SplitWise ===");
        System.out.println("Track shared expenses with friends.");
        System.out.println();
        System.out.println("Ready. More features coming in the next lessons.");

        Scanner input = new Scanner(System.in);
        ArrayList<Friend> friend = new ArrayList<>();
        boolean running = true;

        while (running)
        {
            System.out.println("=== Menu ===");
            System.out.println("1. Record Expense");
            System.out.println("2. Add friend");
            System.out.println("3. List friend");
            System.out.println("0. Quit");
            System.out.print("Choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice)
            {
                case 1 ->
                {
                    if (friend.isEmpty())
                    {
                        System.out.println("no friends added yet");
                    }
                    else
                    {
                        System.out.print("Who paid? ");
                        String payerName = input.nextLine();

                        System.out.print("Total Amount ? ");
                        double totalAmount = input.nextDouble();
                        input.nextLine();

                        int numFriends = friend.size();

                        Expense obj = new Expense(payerName, totalAmount);

                        double perPersonShare = obj.getAmount() / numFriends;

                        String expenseLine = "%s paid %.2f".formatted(obj.getPayerName(), obj.getAmount());

                        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);

                        System.out.println(expenseLine);
                        System.out.println(shareLine);
                    }
                }
                case 2 -> SplitwiseApp.addfriend(input, friend);

                case 3 ->
                {
                    if (friend.isEmpty())
                    {
                        System.out.println("No friend yet.");
                    }
                    else
                    {
                        System.out.println("Friends:");
                    }

                    for (Friend name : friend)
                    {
                        System.out.println("   " + name.getName());
                    }
                }
                case 0 ->
                {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default ->
                        System.out.println("Invalid Choice!");
            }
        }
    }
    public static void addfriend(Scanner input, ArrayList<Friend> friend)
    {
        System.out.println("Friend name:");
        String friendName = input.nextLine();
        friend.add(new Friend(friendName));
        System.out.println("Added " + friendName + ".");
    }
}