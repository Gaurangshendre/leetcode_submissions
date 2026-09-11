class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort()
        k=[intervals[0]]
        for start,end in intervals[1:]:
            if start<=k[-1][1]:
                k[-1][1]=max(k[-1][1],end)
            else:
               k.append([start,end])
        return k



        