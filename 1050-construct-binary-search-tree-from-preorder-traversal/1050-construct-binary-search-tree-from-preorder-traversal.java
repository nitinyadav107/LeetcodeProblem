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
    int index=0;
    TreeNode solve(int [] inorder,int [] preorder,int start,int end){
        if(start>end || index >= preorder.length) return null;
        int num=preorder[index++];
        TreeNode x=new TreeNode(num);
        int idx=-1;
        if(start==end) return x;
        for(int i=start;i<=end;i++){
            if(inorder[i]==num){
                idx=i;
                break;
            }
        }
        x.left=solve(inorder,preorder,start,idx-1);
        x.right=solve(inorder,preorder,idx+1,end);
        return x;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        int [] inorder=new int[n];
        for(int i=0;i<n;i++){
            inorder[i]=preorder[i];
        }
        Arrays.sort(inorder);
        return solve(inorder,preorder,0,n);

        
    }
}