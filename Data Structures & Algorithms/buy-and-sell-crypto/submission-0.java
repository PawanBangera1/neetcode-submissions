class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int n = prices.length;
        int currMax = prices[n-1];
        for(int i=n-2;i>=0;i--){
            if(prices[i]<currMax){
                int newPrice= currMax-prices[i];
                maxP= Math.max(maxP, newPrice);
            }
            else{
                currMax=prices[i];
            }
        }
        return maxP;
    }
}
