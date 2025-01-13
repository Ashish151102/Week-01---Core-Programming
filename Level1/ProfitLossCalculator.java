public class ProfitLossCalculator {
    public static void main(String[] args) {
	
        // Create variable CostPrice and SellingPrice and assigned value
        double CostPrice = 129.0;
        double SellingPrice = 191.0;

        // Calculate profit and profit percentage
        double Profit = SellingPrice - CostPrice;
        double Profit_Percentage = (Profit / CostPrice) * 100;

        // Printing output in single print statement 
        System.out.println(
            "The Cost Price is INR " + CostPrice + " and Selling Price is INR " + SellingPrice + "\n" +
            "The Profit is INR " + Profit + " and the Profit Percentage is " + Profit_Percentage + "%"
        );
    }
}
