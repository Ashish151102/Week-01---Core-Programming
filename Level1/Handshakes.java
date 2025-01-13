import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.printf("The maximum number of possible handshakes among %d students is %d\n",
                numberOfStudents, maxHandshakes);

        // Close the scanner
        input.close();
    }
}
