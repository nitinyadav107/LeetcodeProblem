class Solution {
    String base(long x, int k) {
        if (x == 0) return "0";

        String ans = "";
        while (x > 0) {
            long rem = x % k;
            ans = rem + ans;
            x /= k;
        }
        return ans;
    }

    boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public long kMirror(int k, int n) {
        int L = 1;
        long ans = 0;

        while (n > 0) {
            int half_length = (L + 1) / 2;
            long min_num = (long) Math.pow(10, half_length - 1);
            long max_num = (long) Math.pow(10, half_length) - 1;

            for (long i = min_num; i <= max_num; i++) {
                String s = "" + i;
                String s1 = (new StringBuilder(s)).reverse().toString();
                String ns = "";

                if (L % 2 == 0) {
                    ns = s + s1;
                } else {
                    ns = s + s1.substring(1);
                }

                long num = Long.parseLong(ns);
                String bs = base(num, k);

                if (isPalindrome(bs)) {
                    ans += num;
                    n--;
                    if (n == 0) return ans;
                }
            }
            L++;
        }
        return ans;
    }
}
