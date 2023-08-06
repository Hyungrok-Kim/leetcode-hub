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
    TreeSet<Integer> ts = new TreeSet<>();

    public void searchDepth(TreeNode target, int depth) {
        if (target.left == null && target.right == null) ts.add(depth);
        else {
            if (target.left != null) searchDepth(target.left, depth + 1);
            if (target.right != null) searchDepth(target.right, depth + 1);
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        searchDepth(root, 1);

        return ts.pollLast();
    }
}