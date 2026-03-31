class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0

        minP = prices[0]

        for item in prices:
            maxP = max(maxP, item - minP)
            minP = min(minP, item)
        
        return maxP