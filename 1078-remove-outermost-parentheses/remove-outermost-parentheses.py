class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        depth=0
        k=""
        for ch in s:
            if ch=='(':
                if depth>0:
                    k=k+ch
                depth+=1
            else:
                depth-=1
                if depth>0:
                    k=k+ch
        return k
