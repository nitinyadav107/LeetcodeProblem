class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int [] pref=new int [n];
        int m=queries.length;
        for(int i=0;i<m;i++){
            int st=queries[i][0];
            int ed=queries[i][1];
            if(st<n) pref[st]++;
            if(ed+1<n) pref[ed+1]--;
        }
        for(int i=1;i<n;i++){
            pref[i]+=pref[i-1];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pref[i]) return false;
        }
        return true;
    }
}