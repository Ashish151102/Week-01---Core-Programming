import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Print the results
        System.out.printf("The distance is %.2f yards and %.2f miles for the given %.2f feet\n",
                distanceInYards, distanceInMiles, distanceInFeet);

        // Close the scanner
        input.close();
    }
}
