class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans=set()
        for i in range(len(nums)):
            hashset=set()
            for j in range(i+1,len(nums)):
                third=-(nums[i]+nums[j])
                if third in hashset:
                    triplet=tuple(sorted([nums[i],nums[j],third]))
                    ans.add(triplet)
                hashset.add(nums[j])
        return [list(trip) for trip in ans]

