import java.util.Arrays;

public class NumberChecker {

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

    // Method to check if a number is a duck number (non-zero digit present)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test the above utility methods
    public static void main(String[] args) {
        int number = 153;  // Example number

        // Store digits of the number in an array
        int[] digits = storeDigits(number);

        // Display the number and its digits
        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        // Count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Check if the number is a Duck Number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if the number is an Armstrong Number
        boolean isArmstrong = isArmstrongNumber(digits, number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find the largest and second largest elements
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Element: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest Element: " + largestAndSecondLargest[1]);

        // Find the smallest and second smallest elements
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Element: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest Element: " + smallestAndSecondSmallest[1]);
    }
}
