class Solution {
    public void moveZeroes(int[] nums) {
      int[] ans=new int[nums.length];
      int j=0;
      int c=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
            
        }
      }
     c=nums.length-j;
      while(c-->0){
        nums[j++]=0;
      }
        
    }
}