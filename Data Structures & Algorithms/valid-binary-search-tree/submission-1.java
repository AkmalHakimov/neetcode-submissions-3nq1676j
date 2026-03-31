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

    static Boolean check_left(int val, int limit){
            return val<limit;
        }

    static Boolean check_right(int val, int limit){
        return val>limit;
    }    

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        if(!isValid(root.left, root.val, Solution::check_left) ||
        !isValid(root.right, root.val, Solution::check_right)
        ){
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);

    }

    public boolean isValid(TreeNode root, int limit, CheckLimit check){
        if(root == null) {
            return true;
        }

        if(!check.apply(root.val,limit)) return false;

        return isValid(root.left, limit, check) && isValid(root.right, limit, check);
        
    }

    interface CheckLimit {
        boolean apply(int val, int limit);
    }
}
