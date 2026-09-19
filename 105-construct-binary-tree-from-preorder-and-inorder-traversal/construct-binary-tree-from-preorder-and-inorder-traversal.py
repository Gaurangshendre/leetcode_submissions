# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: Optional[TreeNode]
        """
        if not inorder or not preorder:
            return None
        root_val=preorder[0]
        root = TreeNode(root_val)
        t= inorder.index(root_val)
        root.left=self.buildTree(preorder[1:t+1],inorder[:t])
        root.right=self.buildTree(preorder[t+1:],inorder[t+1:])
        return root

            
        
        


        