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
     long x = Long.MIN_VALUE;
    boolean check=false;
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(x>=root.val)  check=true;
        x=root.val;
        if(check==true) return;
        helper(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        helper(root);
        if(check==true) return false;
        return true;
    }
}