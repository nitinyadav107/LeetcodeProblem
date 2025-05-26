class Solution {
    void helper(int [] nums,HashSet<List<Integer>> ans,ArrayList<Integer> part,HashSet<Integer> set){
        if(part.size()==nums.length){
            ans.add(new ArrayList<>(part));
            return;
        }
       
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                set.add(i);
                part.add(nums[i]);
                helper(nums,ans,part,set);
                set.remove(i);
                part.remove(part.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
       HashSet<List<Integer>>  ans=new HashSet<>();
        ArrayList<Integer> part=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        helper(nums,ans,part,set);
        return new ArrayList<>(ans);
    }
}