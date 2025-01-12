import java.util.Arrays;

public class Number4_Checker {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // A Duck number has a non-zero digit
            }
        }
        return false;
    }

    // Main method to test the utility methods
    public static void main(String[] args) {
        int number = 121;  // Example number to test

        // Store digits of the number in an array
        int[] digits = storeDigits(number);

        // Display the number and its digits
        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Check if the number is a Duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);
    }
}
