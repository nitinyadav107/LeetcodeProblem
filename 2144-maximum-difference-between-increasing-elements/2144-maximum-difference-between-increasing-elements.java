class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    max=Math.max(max,nums[j]-nums[i]);
                }
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}