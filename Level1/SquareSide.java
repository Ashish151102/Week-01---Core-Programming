import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side length
        double side = perimeter / 4;

        // Print the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        // Close the scanner
        input.close();
    }
}
