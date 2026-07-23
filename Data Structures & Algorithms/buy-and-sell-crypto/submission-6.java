class Solution {
    public int maxProfit(int[] prices) {
        int pricesLength = prices.length;
        int maxProfit = 0;
        int sell = 0;
        int sellIndex = pricesLength - 1;
        int buy = 101;
        int buyIndex = pricesLength - 1;
        for (int i = pricesLength - 1; i > 0; i--) {
            int thisProfit = prices[i] - prices[i - 1];
            System.out.println("thisProfit: " + thisProfit);
            System.out.println("(sell - prices[i - 1]): " + String.valueOf(sell - prices[i - 1]));

            if (thisProfit > maxProfit || (sell - prices[i - 1]) > thisProfit) {
                if (prices[i] > sell) {
                    sell = prices[i];
                    sellIndex = i;
                    maxProfit = sell - buy;
                    if(sellIndex < buyIndex){
                        buy = 101;
                    }
                    System.out.println("sell: " + sell);
                    System.out.println("sellIndex: " + sellIndex);
                }
                if (prices[i - 1] < buy) {
                    buy = prices[i - 1];
                    buyIndex = i - 1;
                    maxProfit = sell - buy;

                    System.out.println("buy: " + buy);
                    System.out.println("buyIndex: " + buyIndex);
                }
            }
        }

        return maxProfit > 0 && buy <= 100 ? maxProfit : 0;
    }
}
