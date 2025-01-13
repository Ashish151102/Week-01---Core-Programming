import java.util.Scanner;

public class DiscountedFee {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Display the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);

        // Close the scanner
        input.close();
    }
}
