class Solution(object):
    def findRedundantConnection(self, edges):
        """
        :type edges: List[List[int]]
        :rtype: List[int]
        """
        parent={}
        def find(x):
            if parent[x]!=x:
                parent[x]=find(parent[x])
            return parent[x]
        def union(u,v):
            pa=find(u)
            pb=find(v)
            if pa==pb:
                return False
            parent[pa]=pb
            return True
        for u,v in edges:
            if u not in parent:
                parent[u]=u
            if v not in parent:
                parent[v]=v
            if not union(u,v):
                return [u,v]
            