# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def rightSideView(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        if root is None:
            return []
        k=[]
        
        self.rightk(root,k,0)
        return k
        
    def rightk(self,root,k,level):
        if not root:
            return
        if level == len(k):
            k.append(root.val)
        self.rightk(root.right,k,level+1)
        self.rightk(root.left,k,level+1)
        

        