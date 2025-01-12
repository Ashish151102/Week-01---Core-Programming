import java.util.Scanner;

public class CalendarProgram {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // For February, check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29; // February has 29 days in a leap year
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Apply the formula to calculate the first day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0; // This will return a value from 0 (Sunday) to 6 (Saturday)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar
        System.out.println("\n     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // First loop: Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Second loop: Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print day, with right justification for single-digit days
            System.out.printf("%3d", day);

            // If it's Saturday (day 6), move to the next line
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Print a newline after the calendar
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the month and year as input from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        scanner.close();
    }
}
