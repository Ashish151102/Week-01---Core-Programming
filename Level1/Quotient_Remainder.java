import java.util.Scanner;

public class Quotient_Remainder {

    // Method to find the quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Call the findRemainderAndQuotient method and get the result
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the quotient and remainder
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
