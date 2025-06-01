class Solution {
    boolean helper(int [] nums,long target,long product,int i){
        if(product==target) return true;
        if(i==nums.length) return false;
        boolean pick=helper(nums,target,product*nums[i],i+1);
        boolean notpick=helper(nums,target,product,i+1);
        return pick || notpick;
       
        
    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        long pt=1;
        for(int num:nums){
            pt=pt*num;
        }
        if (pt != target * target) return false;
        long k=target;
        return helper(nums,target,1L,0);
    }
}