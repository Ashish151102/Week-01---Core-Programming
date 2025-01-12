import java.util.Scanner;

public class WindChill_temp {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Applying the wind chill formula
        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the temperature and wind speed from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Call the calculateWindChill method to get the result
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the wind chill temperature
        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
