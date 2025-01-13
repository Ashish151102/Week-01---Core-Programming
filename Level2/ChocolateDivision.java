import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates each child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the results
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d.%n",
                          chocolatesPerChild, remainingChocolates);

        // Close the scanner
        scanner.close();
    }
}