class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int l=k;
        int [][] nums1=new int[n][2];
        for(int i=0;i<n;i++){
            nums1[i][0]=nums[i];
            nums1[i][1]=i;
        }
      Arrays.sort(nums1, (a, b) -> Integer.compare(a[0], b[0]));
        int p=0;
        int [][] ans=new int[k][2];
        for(int i=nums1.length-1;i>=0 && k>0;i--){
            ans[p][0]=nums1[i][0];
            ans[p++][1]=nums1[i][1];
            k--;
        }
       Arrays.sort(ans, (a, b) -> Integer.compare(a[1], b[1]));
        int [] out=new int[l];
        for(int i=0;i<ans.length;i++){
            out[i]=ans[i][0];
        }
        return out;
        
    }
}