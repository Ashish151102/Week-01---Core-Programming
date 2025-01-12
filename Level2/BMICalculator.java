import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and store it in the array
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < bmiData.length; i++) {
            double weight = bmiData[i][0];  // weight in kg
            double heightInCm = bmiData[i][1];  // height in cm
            double heightInMeters = heightInCm / 100;  // convert cm to meters
            
            // BMI formula: BMI = weight / (height^2)
            double bmi = weight / (heightInMeters * heightInMeters);
            bmiData[i][2] = bmi;  // Store BMI in the third column of the 2D array
        }
    }

    // Method to determine the BMI status for each person and return an array of statuses
    public static String[] getBMIStatus(double[][] bmiData) {
        String[] bmiStatus = new String[bmiData.length];

        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];  // BMI value from the array
            
            if (bmi < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                bmiStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obesity";
            }
        }
        return bmiStatus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI of 10 people
        double[][] bmiData = new double[10][3];  // 10 people, 3 columns (weight, height, bmi)

        // Take input for weight and height for each person
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter weight in kg: ");
            bmiData[i][0] = scanner.nextDouble();  // weight in kg

            System.out.print("Enter height in cm: ");
            bmiData[i][1] = scanner.nextDouble();  // height in cm
        }

        // Calculate BMI for each person
        calculateBMI(bmiData);

        // Get BMI status for each person
        String[] bmiStatus = getBMIStatus(bmiData);

        // Display the results for each person
        System.out.println("\nBMI Information for all 10 people:");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Weight (kg)", "Height (cm)", "BMI", "BMI Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double weight = bmiData[i][0];
            double height = bmiData[i][1];
            double bmi = bmiData[i][2];
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s\n", weight, height, bmi, bmiStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
