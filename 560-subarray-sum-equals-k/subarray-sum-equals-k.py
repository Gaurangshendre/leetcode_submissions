class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count=0
        mp={0:1}
        sumi=0
        for i in nums:
            sumi+=i
            if sumi-k in mp:
                count+=mp[sumi-k]
            mp[sumi]=mp.get(sumi,0)+1
        return count


        