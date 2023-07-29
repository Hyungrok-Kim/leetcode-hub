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
// 중위순위(Inorder) L-Root-R
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> treeStack = new Stack<>();
        List<Integer> resultList = new ArrayList<>();

        TreeNode target = root;

        while (target != null || !treeStack.empty()) {
            while(target != null) {
                treeStack.push(target);
                target = target.left;
            }
            
            TreeNode temp = treeStack.pop();
            resultList.add(temp.val);
            target = temp.right;
        }
        
        return resultList;
    }
}