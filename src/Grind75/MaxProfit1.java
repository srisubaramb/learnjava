package Grind75;

public class MaxProfit1 {
    int maxProfit = 0;
    public int calculateMaxProfit(int[] prices) {
        for(int i = 0; i < prices.length ; i++){
            int currentBuyingPrice = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int currentProfit = prices[j] - currentBuyingPrice;
                if(currentProfit > maxProfit) maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
