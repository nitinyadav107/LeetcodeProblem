class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int n1=nums.length;
        if(n==0) return true;
        if(nums.length==1 && nums[0]==0) return true;
        for(int i=0;i<n1;i++){
            if(nums[i]==0 && i-1>=0 && nums[i-1]==0 && i+1<n1 && nums[i+1]==0) {
                n--;
                nums[i]=1;
            }
            else if(i==0 && nums[i]==0 && i+1<n1 && nums[i+1]==0){
                n--;
                nums[i]=1;
            }
            else if(i==n1-1 && nums[i]==0 && i-1>=0 && nums[i-1]==0){
                n--;
                nums[i]=1;
            }
        
            if(n==0) return true;
        }
        return false;
    }
}