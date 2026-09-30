class Solution(object):
    def dailyTemperatures(self, temperatures):
        """
        :type temperatures: List[int]
        :rtype: List[int]
        """
        st=[0]*len(temperatures)
        stack=[]
        
        for i in range(len(temperatures)):
            

            while stack and  temperatures[i]>temperatures[stack[-1]]:
                idx=stack.pop()
                st[idx]=i-idx
            
            stack.append(i)


        
            

            
            
        return st
                    
        