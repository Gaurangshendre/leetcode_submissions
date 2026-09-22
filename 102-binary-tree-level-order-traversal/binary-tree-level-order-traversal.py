# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        if root is None:
            return []
        k=[]
        
        self.level([root],k)
        return k
    def level(self,nodes,k):
       
        if not nodes:
            return 
        k.append([node.val for node in nodes])
        nxt=[]
        for node in nodes:

            if node.left:
                nxt.append(node.left)
            if node.right:
                nxt.append(node.right)

        self.level(nxt,k)




        
       