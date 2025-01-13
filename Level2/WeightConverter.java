import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter the weight of the person in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Conversion factor
        double poundsToKg = 2.2;

        // Calculate weight in kilograms
        double weightKg = weightPounds / poundsToKg;

        // Display the results
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.%n", weightPounds, weightKg);

        // Close the scanner
        scanner.close();
    }
}
