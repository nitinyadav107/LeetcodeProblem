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
    int result=-1;
    int c=0;
    void helper(TreeNode root,int k){
        if(root==null) return;
        helper(root.left,k);
        c++;
        if(c==k){
            result=root.val;
            return;
        }
        helper(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return result;
    }
}