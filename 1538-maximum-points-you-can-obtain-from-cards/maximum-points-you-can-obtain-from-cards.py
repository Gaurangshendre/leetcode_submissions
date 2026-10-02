class Solution(object):
    def maxScore(self, cardPoints, k):
        """
        :type cardPoints: List[int]
        :type k: int
        :rtype: int
        """
        maxi=sum(cardPoints[:k])
        curr=sum(cardPoints[:k])
        n=len(cardPoints)
        for i in range(k):
            curr=curr-cardPoints[k-i-1]+cardPoints[n-i-1]
            maxi=max(curr,maxi)
        return maxi

        