import java.util.Scanner;

public class Check_Number {

    // Method to check whether the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; 
        } else if (number < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call the checkNumber method and get the result
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number " + number + " is positive.");
        } else if (result == -1) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }

        // Close the scanner to avoid resource leak
        input.close();
    }
}
