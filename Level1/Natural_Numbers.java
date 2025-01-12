import java.util.Scanner;

public class Natural_Numbers {

    // Method to calculate the sum of the first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the value of n from the user
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Ensure the input is a positive number
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call the sumOfNaturalNumbers method and print the result
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        // Close the scanner to avoid resource leak
        input.close();
    }
}
