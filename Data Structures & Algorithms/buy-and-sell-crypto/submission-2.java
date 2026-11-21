class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0; 
        int sell = 1;
        int maxProfit = 0; 
        while(sell < prices.length){
            System.out.printf("buy price: %d  sell price: %d\n", prices[buy], prices[sell]);
            if (prices[sell] < prices[buy]){
                buy = sell; //found something cheaper
                sell = sell +1;
            }
            else{
               //then buy > sell
               int currProfit = prices[sell] - prices[buy];
               maxProfit = Math.max(maxProfit, currProfit);
               System.out.printf("max profit: %d\n", maxProfit);
               sell++;
            }
        }
        return maxProfit;

    }
}
