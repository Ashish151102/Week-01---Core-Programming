import java.util.Scanner;

public class MaxHandshakes {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Check if the number of students is at least 2
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required to have a handshake.");
        } else {
            // Calculate the maximum number of handshakes using the combination formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        }

        // Close the scanner
        scanner.close();
    }
}
