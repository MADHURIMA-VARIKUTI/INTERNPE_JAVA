import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Lets play Rock, Paper, Scissors!");
        System.out.println("Please choose: 1 for Rock, 2 for Paper, 3 for Scissors, or 0 to quit");

        while(true) {
            System.out.print("Your choice: ");
            int userChoice = scanner.nextInt();

            if (userChoice == 0) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please choose 1, 2, 3, or 0.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("Computer's choice: " + computerChoice);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}

