import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        // Check for negative age
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }
        // Check if age is 18 or above
        if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible to vote
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Create an instance of the StudentVoteChecker class
        StudentVoteChecker checker = new StudentVoteChecker();

        // Loop to take the age of 10 students as input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt(); // Take age input for each student

            // Check if the student can vote and display the result
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
