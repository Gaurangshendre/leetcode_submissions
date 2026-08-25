class Solution(object):
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        def backtrack(start,path):
            if len(path)==k:
                if sum(path)==n:

                    m.append(path[:])
                    return
            if sum(path)>n:
                return
            
            for i in range(start,10):
                    
                path.append(i)
                backtrack(i+1,path)
                path.pop()
                    
        m=[]
        backtrack(1,[])
        return m