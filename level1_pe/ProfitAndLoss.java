public class ProfitAndLoss {
    public static void main(String[] args) {
        // Declare the cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate the profit
        double profit = sellingPrice - costPrice;

        // Calculate the profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Print the result in a single statement with multiline text
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
