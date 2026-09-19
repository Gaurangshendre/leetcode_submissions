# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isValidBST(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        return self.check(root,float('-inf'),float('inf'))
    def check(self,root,low,high):
        if root is None:
            return True
        if low>=root.val or high<=root.val:
            return False
        return (self.check(root.left,low,root.val) and self.check(root.right,root.val,high))