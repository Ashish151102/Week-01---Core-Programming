import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input personal and travel details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you pass through (via): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your final destination city: ");
        String toCity = scanner.nextLine();

        // Input distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        // Input time taken for the journey
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Input fee and discount percentage
        System.out.print("Enter the fee amount: ");
        int fee = scanner.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discountPercent = scanner.nextInt();

        // Calculate discounted fee
        int discountedFee = fee - (fee * discountPercent / 100);

        // Display results
        System.out.println("The results of Int Operations are" + averageSpeed + fee + "and" + discountedFee);
        System.out.printf("Average Speed: %.2f miles/hour%n", averageSpeed);
        System.out.println("\nFee Calculations:");
        System.out.println("Original Fee: $" + fee);
        System.out.println("Discounted Fee: $" + discountedFee);

        // Demonstrating integer operations
        System.out.println("\nThe results of Integer Operations are:");
        System.out.println("Fee: " + fee);
        System.out.println("Discount Percentage: " + discountPercent);
        System.out.println("Discounted Fee: " + discountedFee);

        // Close the scanner
        scanner.close();
    }
}
