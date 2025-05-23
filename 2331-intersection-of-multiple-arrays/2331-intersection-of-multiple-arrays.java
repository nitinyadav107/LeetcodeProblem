class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer>  set1=new HashSet<>();
        for(int i=0;i<nums[0].length;i++){
            set1.add(nums[0][i]);
        }
        for(int i=1;i<nums.length;i++){
            int [] arr=nums[i];
            HashSet<Integer>  set2=new HashSet<>();
            for(int j=0;j<arr.length;j++){
                if(set1.contains(nums[i][j])){
                    set2.add(nums[i][j]);
                }
            }
            set1=set2;
        }
        List<Integer> ans=new ArrayList<>();
        for(int x:set1){
            ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
}