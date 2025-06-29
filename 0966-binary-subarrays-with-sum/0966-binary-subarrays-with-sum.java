class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if (goal == 0) {
            int count = 0, zeros = 0;
            for (int num : nums) {
                if (num == 0) {
                    zeros++;
                } else {
                    count += (zeros * (zeros + 1)) / 2;
                    zeros = 0;
                }
            }
            count += (zeros * (zeros + 1)) / 2; // for trailing zeros
            return count;
        }

        // your original logic below this point
        int sum = 0;
        int j = 0;
        int n = nums.length;
        int[] ans = new int[n];
        ans[n - 1] = n;
        int x = (nums[n - 1] == 0) ? n : n - 1;

        for (int i = n - 2; i >= 0; i--) {
            ans[i] = x;
            x = (nums[i] == 1) ? i : ans[i];
        }

        int ans1 = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum == goal) {
                ans1 += (ans[i] - i);
                if (j <= i && nums[j] == 1) sum--;
                j++;
            }
        }

        return ans1;
    }
}
