import java.util.Scanner;

public class Athlete_Run {

    // Method to calculate the perimeter of the triangle
    public static double Perimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds to complete 5 km (5000 meters)
    public static int Rounds(double perimeter) {
        double distance = 5000;  // Distance to cover (in meters)
        return (int) Math.ceil(distance / perimeter); // Round up to ensure complete rounds
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the three sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = Perimeter(side1, side2, side3);

        // Calculate the number of rounds needed to complete 5 km
        int rounds = Rounds(perimeter);

        // Output the result
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 kilometers.");
        
        // Close the scanner
        input.close();
    }
}
