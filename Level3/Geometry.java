import java.util.Scanner;

public class Geometry {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m) using the formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b) using the formula: b = y1 - m * x1
        double b = y1 - m * x1;

        // Return an array containing the slope and the y-intercept
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        // Display the equation of the line in the form y = mx + b
        System.out.println("Equation of the line: y = " + slope + "x + " + intercept);
        
        scanner.close();
    }
}
