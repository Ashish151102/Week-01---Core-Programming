import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter the salary in INR: ");
        double salary = scanner.nextDouble();

        // Prompt the user to enter the bonus
        System.out.print("Enter the bonus in INR: ");
        double bonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome + ".");

        // Close the scanner
        scanner.close();
    }
}
