class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2]) return "none";
        int s1=nums[0];
        int s2=nums[1];
        int s3=nums[2];
        if(s1==s2 && s2==s3) return  "equilateral";
        if(s1==s3 || s1==s2 || s2==s3) return  "isosceles";
        if(s1!=s2 && s2!=s3 && s1!=s3) return "scalene";
        return "none";
    }
}