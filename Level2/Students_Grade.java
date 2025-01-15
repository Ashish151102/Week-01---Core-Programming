import java.util.Random;

public class Students_Grade {
    public static void main(String[] args) {
        int numStudents = 10; // Number of students
        int[][] marks = generateMarks(numStudents); // Generate random marks
        double[][] results = calculateResults(marks); // Calculate total, average, and percentage
        String[][] grades = calculateGrades(results); // Calculate grades based on percentage

        // Display scorecard
        displayScorecard(marks, results, grades);
    }

    // Method to generate random marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(41) + 60; // Random marks between 60 and 100 for Physics
            marks[i][1] = rand.nextInt(41) + 60; // Random marks between 60 and 100 for Chemistry
            marks[i][2] = rand.nextInt(41) + 60; // Random marks between 60 and 100 for Maths
        }
        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][4];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total; // Total marks
            results[i][1] = average; // Average marks
            results[i][2] = percentage; // Percentage
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A"; // Grade A
            } else if (percentage >= 70) {
                grades[i][0] = "B"; // Grade B
            } else if (percentage >= 60) {
                grades[i][0] = "C"; // Grade C
            } else if (percentage >= 50) {
                grades[i][0] = "D"; // Grade D
            } else if (percentage >= 40) {
                grades[i][0] = "E"; // Grade E
            } else {
                grades[i][0] = "R"; // Grade R
            }
        }
        return grades;
    }

    // Method to display scorecard for all students
    public static void displayScorecard(int[][] marks, double[][] results, String[][] grades) {
        System.out.println("Student Scorecard:");
        System.out.println("-----------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t\t" + marks[i][1] + "\t\t" + marks[i][2]
                    + "\t" + results[i][0] + "\t" + Math.round(results[i][1] * 100.0) / 100.0 + "\t"
                    + Math.round(results[i][2] * 100.0) / 100.0 + "%\t\t" + grades[i][0]);
        }
    }
}
