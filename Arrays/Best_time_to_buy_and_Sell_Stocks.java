import java.util.*;

public class Best_time_to_buy_and_Sell_Stocks{ // Class name should start with a capital letter
    public static int buyAndSellStocks(int[] prices) { // Method name should follow camelCase convention
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) { // Update buyPrice if a lower price is found
                buyPrice = prices[i];
            } else if (prices[i] - buyPrice > maxProfit) { // Calculate profit only when a potential sale is possible
                maxProfit = prices[i] - buyPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}
