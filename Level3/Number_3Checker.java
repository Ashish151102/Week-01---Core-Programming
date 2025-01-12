import java.util.Arrays;

public class Number_3Checker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);  // Square of each digit
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using a digits array
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sum = sumOfDigits(digits);
        return originalNumber % sum == 0;
    }

    // Method to find the frequency of each digit in the number using a 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // Array to store frequency of digits 0-9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // First column stores the digit (0 to 9)
            frequency[i][1] = 0;   // Initialize frequency to 0
        }
        
        for (int digit : digits) {
            frequency[digit][1]++;  // Increment frequency of the corresponding digit
        }
        
        return frequency;
    }

    // Main method to test the utility methods
    public static void main(String[] args) {
        int number = 21;  // Example number to test

        // Store digits of the number in an array
        int[] digits = storeDigits(number);

        // Display the number and its digits
        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        // Count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumDigits);

        // Sum of squares of digits
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(digits, number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit in the number
        int[][] frequencies = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequencies[i][1] > 0) {
                System.out.println("Digit " + frequencies[i][0] + " appears " + frequencies[i][1] + " times");
            }
        }
    }
}
