class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0; 
        int sell = 1;
        int maxProfit = 0; 
        while(buy < prices.length && sell < prices.length){
            if (prices[sell]<prices[buy]){
                //we found a cheaper day to buy
                buy = sell;
                sell = sell + 1;
            }else{
                //we found a potential profit
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
                sell ++; 
            }
        }  
        return maxProfit;
    }
}
