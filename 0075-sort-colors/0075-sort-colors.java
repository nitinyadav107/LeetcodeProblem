class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) one++;
            else if(nums[i]==2) two++;
        }
        int idx=0;
        while(zero>0){
            nums[idx++]=0;
            zero--;
        }
         while(one>0){
            nums[idx++]=1;
            one--;
        }
         while(two>0){
            nums[idx++]=2;
            two--;
        }
        
    }
}