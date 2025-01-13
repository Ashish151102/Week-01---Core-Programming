import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        // Convert cm to feet and inches
        double inches = cm / 2.54;
        int feet = (int) inches / 12;
        inches = inches % 12;

        // Display the result
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f\n", cm, feet, inches);

        // Close the scanner
        input.close();
    }
}
