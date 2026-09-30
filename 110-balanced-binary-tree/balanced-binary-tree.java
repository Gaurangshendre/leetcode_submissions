/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int hleft=balance(root.left);
        
        int hright=balance(root.right);

if(Math.abs(hleft-hright)>1){
    return false;
}
return isBalanced(root.right)&&isBalanced(root.left);
    }
    public int balance(TreeNode root){
        if (root==null)return 0;
        int hleft=balance(root.left);
        int hright=balance(root.right);
        return 1+Math.max(hleft,hright);

        
    }
}