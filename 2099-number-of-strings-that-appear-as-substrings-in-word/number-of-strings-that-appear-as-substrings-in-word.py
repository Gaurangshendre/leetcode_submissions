class Solution(object):
    def numOfStrings(self, patterns, word):
        """
        :type patterns: List[str]
        :type word: str
        :rtype: int
        """
        count=0
        substring=[]
        for i in range(len(word)):
            for j in range(i+1,len(word)+1):
                substring.append(word[i:j])
        for i in patterns:
            if i in substring:
                count+=1
        return count
