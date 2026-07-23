class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestSellPrice = prices[prices.length - 1];

        for (int i = prices.length - 2; i >= 0; i--) {
            int currentProfit = bestSellPrice - prices[i];
            maxProfit = Math.max(maxProfit, currentProfit);

            bestSellPrice = Math.max(bestSellPrice, prices[i]);
        }

        return maxProfit;
    }
}
