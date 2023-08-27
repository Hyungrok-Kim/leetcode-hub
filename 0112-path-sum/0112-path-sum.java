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
    public boolean recursive(TreeNode target, int sum, int targetSum) {
        if (target.left == null && target.right == null) {
            if (sum == targetSum) return true;
            else return false;
        }

        if (target.left != null && target.right != null ) 
            return recursive(target.left, sum + target.left.val, targetSum) || recursive(target.right, sum + target.right.val, targetSum);
        
        if (target.left != null) return recursive(target.left, sum + target.left.val, targetSum);
        else if (target.right != null) return recursive(target.right, sum + target.right.val, targetSum);
        
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        recursive(root, root.val, targetSum);

        return recursive(root, root.val, targetSum);
    }
}