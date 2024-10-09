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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        List<Integer> setup = new ArrayList<>();
        setup.add(root.val);
        results.add(setup);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> orders = new ArrayList<>();
            for (int i = 0; i < queueSize; ++i) {
                TreeNode target = queue.poll();
                if (target.left != null) {
                    queue.add(target.left);
                    orders.add(target.left.val);
                }
                if (target.right != null) {
                    queue.add(target.right);
                    orders.add(target.right.val);
                }
            }
            if (!orders.isEmpty()) {
                results.add(orders);
            }
        }
        return results;
    }
}