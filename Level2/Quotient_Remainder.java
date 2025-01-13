import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;  // Division for quotient
        int remainder = number1 % number2;  // Modulus for remainder

        // Output: Display the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                           " of two numbers " + number1 + " and " + number2);

        // Close the scanner
        scanner.close();
    }
}
