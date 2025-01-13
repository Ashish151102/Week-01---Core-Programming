import java.util.Scanner;

public class AthleteRoundsCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert the total distance of 5 km to meters
        double totalDistance = 5000; // 5 km = 5000 meters

        // Calculate the number of rounds (round up to the nearest whole number)
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        // Output the result
        System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km.%n", rounds);

        // Close the scanner
        scanner.close();
    }
}