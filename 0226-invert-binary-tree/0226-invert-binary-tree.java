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
    private void dfs(TreeNode targetNode) {
        if (targetNode == null) {
            return ;
        }
        TreeNode temp = new TreeNode();
        temp = targetNode.left;
        targetNode.left = targetNode.right;
        targetNode.right = temp;
        dfs(targetNode.left);
        dfs(targetNode.right);
    }
    
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        return root;
    }
}