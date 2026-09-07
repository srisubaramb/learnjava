package Grind75;

public class MaxProfit2 {
    public int calculateMaxProfit(int[] prices){
        int maxProfit = 0;
        if (prices.length == 0) return  0;
        int minBuy = prices[0];
        for(int i = 1; i < prices.length ; i++){
            int currentSellingPrice = prices[i];
            int currentProfit = currentSellingPrice - minBuy;
            if(currentProfit > maxProfit) maxProfit = currentProfit;
            if(currentSellingPrice < minBuy) minBuy = currentSellingPrice;
        }
        return  maxProfit;
    }
}
