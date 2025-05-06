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
    
    TreeNode helper(int [] nums,int start,int end){
        if(start>=end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode x=new TreeNode(nums[mid]);
        x.left=helper(nums,start,mid);
        x.right=helper(nums,mid+1,end);
        return x;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(nums,0,nums.length);
    }
}