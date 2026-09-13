class Solution(object):
    def rearrangeArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ps=[]
        neg=[]
        count=0
        j=0
        k=0
        final=[0]*len(nums)
        j=0
        for i in nums:
            if i>0:
                ps.append(i)
            else:
                neg.append(i)
        for i in range(len(final)):
            if count==0:
                final[i]=ps[j]
                j+=1
                count=1
            else:
                final[i]=neg[k]
                k+=1
                count=0
        return final
            

        
