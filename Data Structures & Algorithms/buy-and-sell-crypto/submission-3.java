class Solution {
    public int maxProfit(int[] prices) {
        
        int lowPr = prices[0], maxPr = 0;

        for(int i = 0; i<prices.length; i++){
            lowPr = Math.min(lowPr, prices[i]);
            maxPr = Math.max(maxPr, prices[i] - lowPr);   

        }

        return maxPr; 

        
    }
}
