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
    int helper(TreeNode root,int prevGreater){
        if(root==null) return 0;
        int ans=0;
        if(root.val>=prevGreater){
            ans=1;
            prevGreater=root.val;
        }
        int lans=helper(root.left,prevGreater);
        int rans=helper(root.right,prevGreater);
        return lans+rans+ans;
    }
    public int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);
    }
}