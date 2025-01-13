import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for base and height
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        // Calculate the area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert the area to square centimeters (1 inch = 2.54 cm)
        double areaInCm = areaInInches * 6.4516;

        // Print the results
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters\n",
                areaInInches, areaInCm);

        // Close the scanner
        input.close();
    }
}


