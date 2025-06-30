class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int j=0;
        int ans=0;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            while( max-min>1){
                if(min==nums[j]) min=nums[j+1];
                j++;

            }
            if(max-min==1){
                ans=Math.max(ans,i-j+1);
            }
        }
        return ans;
    }
}