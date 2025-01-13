import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the results
        System.out.printf("The addition, subtraction, multiplication and division of %.2f and %.2f are %.2f, %.2f, %.2f, and %.2f\n",
                number1, number2, addition, subtraction, multiplication, division);

        // Close the scanner
        input.close();
    }
}
