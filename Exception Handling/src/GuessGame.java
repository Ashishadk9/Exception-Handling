import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(10);
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 0-9");

        while (true) {
            try {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == target) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    break;
                } else {
                    System.out.println("Wrong guess. Try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer only.");
                scanner.next(); // Clear the invalid input
                attempts++; // Count invalid attempts
            }
        }
    }
}