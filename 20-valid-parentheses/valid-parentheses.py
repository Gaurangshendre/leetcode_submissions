class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        stack=[]
        mapping= {')':'(', '}':'{', ']':'['}
        for i in s :
            if i in "({[":
                stack.append(i)
            else:
                if not stack or stack[-1]!=mapping[i]:
                    return False
                stack.pop()
        return len(stack)==0
            
                
        