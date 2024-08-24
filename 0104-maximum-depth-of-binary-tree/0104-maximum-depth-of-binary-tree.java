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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = 1;
        int rightResult = 1;
        if (root.left != null) {
            leftResult = this.getDepth(root.left, 1);
        }
        if (root.right != null) {
            rightResult = this.getDepth(root.right, 1);
        }
        return Math.max(leftResult, rightResult);
    }
    
    private int getDepth(TreeNode targetNode, int depth) {
        if (targetNode == null) {
            return depth;
        }
        return Math.max(this.getDepth(targetNode.left, depth + 1), this.getDepth(targetNode.right, depth + 1));
    }
}