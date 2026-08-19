class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        final = [0]
        for i in range(0,len(prices)):
            for j in range(i+1,len(prices)):
                sum = prices[j] - prices[i]
                final.append(sum)
                sum = 0 
        final.sort()
        if(final[len(final)-1]>0):
            return final[len(final)-1]               
        else:
            return 0