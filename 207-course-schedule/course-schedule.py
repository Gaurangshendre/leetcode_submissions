class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: bool
        """
        pre={i:[] for i in range(numCourses)}
        for a,b in prerequisites:
            if a>numCourses-1 or b > numCourses-1:
                return False
            pre[a].append(b)
        visiting=set()
        visited=set()
        def dfs(course):
            if course in visiting:
                return False
            if course in visited:
                return True
            visiting.add(course)
            for i in pre[course]:
                if not dfs(i):
                    return False
            visiting.remove(course)
            visited.add(course)
            return True

        for i in range(numCourses):
            if not dfs(i):
                return False
        return True
        

        