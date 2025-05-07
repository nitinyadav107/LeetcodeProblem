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
    ArrayList<Integer> arr=new ArrayList<>();
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        arr.add(root.val);
        helper(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        helper(root);
        int i=0;
        int j=arr.size()-1;
        while(j>i){
            if(arr.get(i)+arr.get(j)==k) return true;
            else if(arr.get(i)+arr.get(j)<k) i++;
            else j--;
        }
        return false;
    }
}