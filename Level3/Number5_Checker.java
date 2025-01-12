import java.util.Arrays;

public class Number5_Checker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Calculate the sum of digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        
        // Calculate sum and product of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return (square % (int)Math.pow(10, countDigits(number))) == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Main method to test the utility methods
    public static void main(String[] args) {
        int number = 7;  // Example number to test

        // Display the number and check various properties
        System.out.println("Number: " + number);

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is Prime: " + prime);

        // Check if the number is a neon number
        boolean neon = isNeon(number);
        System.out.println("Is Neon Number: " + neon);

        // Check if the number is a spy number
        boolean spy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + spy);

        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is Automorphic Number: " + automorphic);

        // Check if the number is a buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + buzz);
    }
}
