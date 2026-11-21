class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0; 
        int sell = 1; 
        int maxProfit = 0; 
        while (sell < prices.length){
            if(prices[sell] < prices[buy]){
                //found something cheaper
                buy = sell;
                sell +=1;
            }else{
                //then we found a proper profit bearing thing
                int currProfit = prices[sell] - prices[buy];
                maxProfit = Math.max(currProfit, maxProfit);
                sell++;
            }
        }
        return maxProfit;
    }
}
