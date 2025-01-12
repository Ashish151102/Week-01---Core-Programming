import java.util.Scanner;

public class Handshake {

    // Method to calculate the number of handshakes
    public static int calculateHandshakes(int n) {
	
        // Using the combination formula: n * (n - 1) / 2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        // Check if the number of students is at least 2, because handshakes require at least 2 people
        if (students < 2) {
            System.out.println("At least 2 students are required to have a handshake.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(students);

            // Output the result
            System.out.printf("The maximum number of handshakes among %d students is: %d.%n", students, handshakes);
        }

        // Close the scanner
        input.close();
    }
}
