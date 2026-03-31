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
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();

        stack.push(new Pair<>(root, 0));
        int res = 0;

        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> current = stack.pop();
            int depth = current.getValue();
            TreeNode node = current.getKey();

            res = Math.max(res, depth);
            if(node != null){
                stack.push(new Pair<>(node.left, depth+1));
                stack.push(new Pair<>(node.right, depth+1));
            }
        }

        return res;
    }
}
