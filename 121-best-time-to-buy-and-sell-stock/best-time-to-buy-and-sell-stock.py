class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxi=0
        min_price=prices[0]
        for i in prices:
            if i<min_price:
                min_price=i
            elif i-min_price>maxi:
                maxi=i-min_price
        return maxi