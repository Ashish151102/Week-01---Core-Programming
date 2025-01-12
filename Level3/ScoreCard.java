import java.util.Scanner;

public class ScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];  // 2D array: [0] for Physics, [1] for Chemistry, [2] for Math
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90);  // Random score for Physics (2-digit)
            scores[i][1] = 10 + (int) (Math.random() * 90);  // Random score for Chemistry (2-digit)
            scores[i][2] = 10 + (int) (Math.random() * 90);  // Random score for Math (2-digit)
        }
        
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4];  // 2D array: [0] for total, [1] for average, [2] for percentage
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  // Calculate total marks
            double average = total / 3.0;  // Calculate average
            double percentage = (total / 300.0) * 100;  // Calculate percentage (out of 300)
            
            // Store total, average, and percentage in the results array
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;  // Round average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  // Round percentage to 2 decimal places
        }
        
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", 
                          "Student ID", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("| %-10d | %-10d | %-10d | %-10d | %-10.2f | %-10.2f | %-10.2f |\n", 
                              i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
        
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate random scores for all students
        int[][] scores = generateScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores, numStudents);
        
        // Display the scorecard
        displayScoreCard(scores, results, numStudents);
        
        scanner.close();
    }
}
