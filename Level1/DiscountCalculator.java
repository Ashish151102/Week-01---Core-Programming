public class DiscountCalculator {
    public static void main(String[] args) {
        // Create double variables fee and discount_Percent and assigned value
        double Fee = 125000;
        double discount_Percent = 10;

        // Calculate the discount amount
        double Discount = (Fee * discount_Percent) / 100;

        // Calculate the final fee after discount
        double final_Fee = Fee - Discount;

        // Print the output 
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", Discount, final_Fee);
    }
}