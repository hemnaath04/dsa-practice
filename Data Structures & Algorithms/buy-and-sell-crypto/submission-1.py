class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        minP = float("inf")
        profit = 0

        for price in prices:
            if price < minP:
                minP = price
            profit = price - minP 
               
            if profit > maxP:
                maxP = profit

        return maxP            