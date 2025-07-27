import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTest {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.println("Enter a number between 11 to 20");
                num = scan.nextInt();

                if (num < 11 || num > 20) {
                    System.out.println("\nIllegal value, " + num + " entered. Please try again!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer value only.");
                scan.next(); // Clear the invalid input
                num = 0; // Reset num to continue loop
            }
        } while (num < 11 || num > 20);

        System.out.println("\nValue correctly entered!!");
    }
}