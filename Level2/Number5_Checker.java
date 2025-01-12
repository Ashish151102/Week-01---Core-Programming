import java.util.Scanner;

public class Number5_Checker {

    // Method to check if a number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero"; // To handle the case of 0
        }
    }

    // Method to check if a positive number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check if the number is positive or negative
        // and also check if positive numbers are even or odd
        for (int i = 0; i < 5; i++) {
            String positivity = isPositive(numbers[i]);
            if (positivity.equals("positive")) {
                String evenOdd = isEvenOrOdd(numbers[i]);
                System.out.println("Number " + numbers[i] + " is positive and " + evenOdd + ".");
            } else if (positivity.equals("negative")) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last element in the array
        int comparisonResult = compare(numbers[0], numbers[4]);

        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        // Close the scanner
        scanner.close();
    }
}
