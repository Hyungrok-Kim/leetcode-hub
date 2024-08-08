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
        if (root == null) {
            return true;
        }
        return Math.abs(this.getMaxDepth(root.left, 1) - this.getMaxDepth(root.right, 1)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getMaxDepth(TreeNode targetNode, int depth) {
        if (targetNode == null) {
            return depth;
        }
        return Math.max(this.getMaxDepth(targetNode.left, depth + 1), this.getMaxDepth(targetNode.right, depth + 1));
    }
}