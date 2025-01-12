import java.util.Scanner;

public class LeapYear {

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Leap year is divisible by 4, but not divisible by 100 unless divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; // It is a leap year
            } else {
                return false; // Not a leap year
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
            return false; // Return false if the year is before 1582
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
