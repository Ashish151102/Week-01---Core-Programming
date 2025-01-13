import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%%, and Time %.2f years.%n", 
                          simpleInterest, principal, rate, time);

        // Close the scanner
        scanner.close();
    }
}