import java.util.Scanner;

public class Simple_Interest{

    // Method to calculate Simple Interest
    public static double CalculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the Time period: ");
        double time = input.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = CalculateInterest(principal, rate, time);
        
        // Output the result
        System.out.printf( "The Simple Interest is " + simpleInterest +  " for Principal "+ principal + " Rate of Interest " + rate + " and Time " + time ); 
        
        // Close the scanner
        input.close();
    }
}
