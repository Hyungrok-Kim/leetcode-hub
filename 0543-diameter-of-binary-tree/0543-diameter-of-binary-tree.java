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
    public int diameterOfBinaryTree(TreeNode treeNode) {
        int result = this.getDepth(treeNode.left, 1) + this.getDepth(treeNode.right, 1);
        int leftResult = result;
        int rightResult = result;
        if (treeNode.left != null) {
            leftResult = Math.max(result, diameterOfBinaryTree(treeNode.left));
        }
        if (treeNode.right != null) {
            rightResult = Math.max(result, diameterOfBinaryTree(treeNode.right));
        }
        if (result > leftResult && result > rightResult) {
            return result;
        }
        return Math.max(leftResult, rightResult);
    }

    private int getDepth(TreeNode treeNode, int depth) {
        if (treeNode == null) {
            return depth - 1;
        }
        return Math.max(getDepth(treeNode.left, depth + 1), getDepth(treeNode.right, depth + 1));
    }
}