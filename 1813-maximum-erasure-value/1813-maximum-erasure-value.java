class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int max=0;
        int j=0;
        for(int i=0;i<n;i++){
          while (map.containsKey(nums[i])) {
                map.remove(nums[j]);
                sum -= nums[j];
                j++;
            }
            map.put(nums[i], 1);
            sum += nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}