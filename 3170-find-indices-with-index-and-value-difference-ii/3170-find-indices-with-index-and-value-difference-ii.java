class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        TreeMap<Integer,Integer> s=new TreeMap<>();
        for(int i=indexDifference;i<nums.length;i++){
            s.put(nums[i-indexDifference],i-indexDifference);
            if(Math.abs(s.firstKey()-nums[i])>=valueDifference){
                return new int[]{s.get(s.firstKey()),i};
            }
            else if(Math.abs(s.lastKey()-nums[i])>=valueDifference){
                return new int[]{s.get(s.lastKey()),i};
            }
        }
        return new int[]{-1,-1};
        
    }
}