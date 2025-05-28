class Solution {
    void helper(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> part,int [] nums, HashSet<Integer> set){
        if(part.size()==nums.length){
            ans.add(new ArrayList<>(part));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                part.add(nums[i]);
                set.add(i);
                helper(ans,part,nums,set);
                part.remove(part.size()-1);
                set.remove(i);
            }
        }
    }
    public int maxGoodNumber(int[] nums) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> part=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        helper(ans,part,nums,set);
        int ans1=Integer.MIN_VALUE;
        for(ArrayList<Integer>x:ans){
            ArrayList<Integer> a=x;
            String b="";
            for(int i=0;i<a.size();i++){
                b+=Integer.toBinaryString(a.get(i));

            }
            int d= Integer.parseInt(b, 2);
            if(ans1<d){
                ans1=d;
            }
        }
        return ans1;

        
    }
}