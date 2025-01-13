
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();

        // Display original numbers
        System.out.println("\nBefore swapping:");
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

        // Swap numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display swapped numbers
       System.err.println(" The swapped numbers are "+ number1 +" and 4"+ number2);
        // Close the scanner
        scanner.close();
    }
}
