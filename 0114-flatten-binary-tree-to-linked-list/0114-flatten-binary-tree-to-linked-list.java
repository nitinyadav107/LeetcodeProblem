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
    TreeNode prev;
    void helper(TreeNode curr){
        if(curr==null) return;
        if(prev!=null){
            prev.left=null;
            prev.right=curr;
        }
        TreeNode right=curr.right;
        prev=curr;
        helper(curr.left);
        helper(right);
    }
    public void flatten(TreeNode root) {
        prev=null;
        helper(root);
    }
}