class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int i = 0, j = 1;
        while(j < prices.length){
            if(prices[j]>prices[i]){
                int profit =prices[j]-prices[i];
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                i=j;
            }
            j++;
        }
        return maxProfit;
    }
}