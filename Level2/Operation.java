import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: Variables a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Calculations: Integer operations
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // Multiplication (*) evaluated before addition (+)
        int result3 = c + a / b;   // Division (/) evaluated before addition (+)
        int result4 = a % b + c;   // Modulus (%) evaluated before addition (+)

        // Output: Display the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close the scanner
        scanner.close();
    }
}
