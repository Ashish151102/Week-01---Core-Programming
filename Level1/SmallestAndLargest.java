import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // Array to store smallest and largest values
        result[0] = Math.min(number1, Math.min(number2, number3)); // Smallest
        result[1] = Math.max(number1, Math.max(number2, number3)); // Largest
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Call the findSmallestAndLargest method and get the result
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the scanner to avoid resource leak
        input.close();
    }
}
