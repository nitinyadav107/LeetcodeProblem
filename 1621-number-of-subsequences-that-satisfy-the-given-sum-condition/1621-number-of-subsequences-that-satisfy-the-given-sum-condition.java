class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
         int mod = 1000000007;
        int [] power=new int[nums.length];
        power[0]=1;
        for(int k=1;k<nums.length;k++){
            power[k]=(power[k-1]*2)%mod;
        }
        int i=0;
         int j=nums.length-1;
        int ans=0;
        while(j>=i){
            if(nums[j]+nums[i]>target){
                j--;
            }
            else{
                int n=j-i+1;
                ans=(ans+power[n-1])%mod;
                i++;
            }

        }
        return ans%mod;
    }
}