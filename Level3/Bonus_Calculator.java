import java.util.Random;

public class Bonus_Calculator {

    // Method to generate random salary and years of service for each employee
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2];  // 2D array: [0] for salary, [1] for years of service
        
        for (int i = 0; i < numEmployees; i++) {
            // Generate random salary between 10000 and 99999 (5-digit salary)
            employeeData[i][0] = 10000 + rand.nextInt(90000);
            // Generate random years of service between 1 and 20 years
            employeeData[i][1] = 1 + rand.nextInt(20);
        }
        
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData, int numEmployees) {
        double[][] bonusAndSalaryData = new double[numEmployees][3];  // 2D array: [0] for old salary, [1] for bonus, [2] for new salary
        
        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;
            
            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;  // 5% bonus
            } else {
                bonus = oldSalary * 0.02;  // 2% bonus
            }
            
            // Calculate new salary after bonus
            double newSalary = oldSalary + bonus;
            
            // Store old salary, bonus, and new salary
            bonusAndSalaryData[i][0] = oldSalary;
            bonusAndSalaryData[i][1] = bonus;
            bonusAndSalaryData[i][2] = newSalary;
        }
        
        return bonusAndSalaryData;
    }

    // Method to calculate the total sum of old salaries, new salaries, and bonuses
    public static void calculateAndDisplayTotals(double[][] bonusAndSalaryData, int numEmployees) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        for (int i = 0; i < numEmployees; i++) {
            totalOldSalary += bonusAndSalaryData[i][0];
            totalBonus += bonusAndSalaryData[i][1];
            totalNewSalary += bonusAndSalaryData[i][2];
        }
        
        // Display results in tabular format
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s |\n", "Employee", "Old Salary", "Bonus", "New Salary", "Years of Service");
        System.out.println("---------------------------------------------------------------");
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("| %-10d | %-10d | %-10.2f | %-10.2f | %-10d |\n", 
                i + 1, (int)bonusAndSalaryData[i][0], bonusAndSalaryData[i][1], bonusAndSalaryData[i][2], (int)(bonusAndSalaryData[i][0] / 10000));
        }
        
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %-10s | %-10.2f | %-10.2f | %-10.2f |\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10; // We have 10 employees
        
        // Generate random data for employees
        int[][] employeeData = generateEmployeeData(numEmployees);
        
        // Calculate the bonus, new salary and other information
        double[][] bonusAndSalaryData = calculateBonusAndNewSalary(employeeData, numEmployees);
        
        // Calculate the totals and display the results
        calculateAndDisplayTotals(bonusAndSalaryData, numEmployees);
    }
}
