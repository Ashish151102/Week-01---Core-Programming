import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate various trigonometric functions (sin, cos, tan)
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Create an array to store the results of sine, cosine, and tangent
        double[] trigonometricResults = new double[3];

        // Calculate the trigonometric functions using Math class
        trigonometricResults[0] = Math.sin(radians);  // Sine of the angle
        trigonometricResults[1] = Math.cos(radians);  // Cosine of the angle
        trigonometricResults[2] = Math.tan(radians);  // Tangent of the angle

        return trigonometricResults;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the angle in degrees from the user
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();

        // Call the calculateTrigonometricFunctions method to get the results
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results for sine, cosine, and tangent
        System.out.printf("Sine of %.2f° = %.4f\n", angle, results[0]);
        System.out.printf("Cosine of %.2f° = %.4f\n", angle, results[1]);
        System.out.printf("Tangent of %.2f° = %.4f\n", angle, results[2]);

        // Close the scanner to avoid resource leak
        input.close();
    }
}
