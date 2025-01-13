import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for a, b, and c as double values
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Perform the specified operations
        double result1 = a + b * c;        // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;        // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b;        // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;        // Modulus (%) has higher precedence than addition (+)

        // Print the results
        System.out.printf("The results of Double Operations are:\n");
        System.out.printf("a + b * c = %.2f\n", result1);
        System.out.printf("a * b + c = %.2f\n", result2);
        System.out.printf("c + a / b = %.2f\n", result3);
        System.out.printf("a %% b + c = %.2f\n", result4); // Use %% to print the modulus operator in printf

        // Close the scanner
        input.close();
    }
}
