import java.util.Scanner;

public class Quadratic {

    // Method to calculate the roots of the quadratic equation
    public static void findRoots(double a, double b, double c) {
        // Calculate the discriminant
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Check if the discriminant is positive, zero, or negative
        if (delta > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two real roots: ");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: ");
            System.out.println("Root: " + root);
        } else {
            // Complex roots (when delta is negative)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("The equation has two complex roots: ");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Validate that a is not zero (if a is zero, it's not a quadratic equation)
        if (a == 0) {
            System.out.println("The value of 'a' cannot be zero. Not a quadratic equation.");
        } else {
            // Call the method to find the roots
            findRoots(a, b, c);
        }

        scanner.close();
    }
}
