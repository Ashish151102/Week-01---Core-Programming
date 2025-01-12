import java.util.Scanner;

public class ChocolatesDistribution {

    // Method to find the number of chocolates each child gets and the remainder
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2]; // Array to store quotient and remainder
        result[0] = numberOfChocolates / numberOfChildren; // Chocolates each child gets
        result[1] = numberOfChocolates % numberOfChildren; // Remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get number of chocolates and children from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if there are no children
        if (numberOfChildren == 0) {
            System.out.println("Error: Cannot divide by zero children.");
        } else {
            // Call the findRemainderAndQuotient method to get the result
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the number of chocolates each child gets and the remaining chocolates
            System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
