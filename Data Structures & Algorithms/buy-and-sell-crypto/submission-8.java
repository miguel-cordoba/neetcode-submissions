class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int biggest = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            if(prices[i+1] > biggest){
                biggest = prices[i+1];
            }
            int thisProfit = biggest - prices[i];
            if(thisProfit> maxProfit){
                maxProfit = thisProfit;
            }
        }
        return maxProfit;
    }
}
