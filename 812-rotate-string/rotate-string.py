class Solution(object):
    def rotateString(self, s, goal):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        
        for i in range(0,len(goal)):
            if s[i:] + s[:i] == goal:
                return True
        
        return False
                
        