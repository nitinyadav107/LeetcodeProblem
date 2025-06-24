class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                for(int j=0;j<n;j++){
                    if(Math.abs(i-j)<=k){
                        ans[j]++;
                    }
                }   
            }
        }
        List<Integer> ans1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans[i]!=0){
                ans1.add(i);
            }
        }
        return ans1;
    }
}