import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        // Base case: If n is 1, the sum is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of n natural numbers = n + sum of (n-1) natural numbers
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        // Formula for sum of first n natural numbers: n*(n+1)/2
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number n from user
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return; // Exit the program if input is not a valid natural number
        }

        // Calculate sum using recursion
        int sumRecursive = sumUsingRecursion(n);

        // Calculate sum using the formula
        int sumFormula = sumUsingFormula(n);

        // Print both results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare both results
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods give the same result. The computation is correct.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
