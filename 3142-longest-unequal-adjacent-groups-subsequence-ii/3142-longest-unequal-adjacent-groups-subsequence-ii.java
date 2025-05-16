class Solution {

    boolean hamming(String w1, String w2) {
        if (w1.length() != w2.length()) return false;
        int c = 0;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                c++;
            }
            if (c > 1) return false;
        }
        return c == 1;
    }

    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ArrayList<String> list = new ArrayList<>();
            list.add(words[i]);
            map.put(i, list);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (groups[i] != groups[j] && hamming(words[i], words[j]) && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    ArrayList<String> x = new ArrayList<>(map.get(j));
                    x.add(0, words[i]); 
                    map.put(i, x);
                }
            }
        }

        int idx = -1;
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maxLen < dp[i]) {
                maxLen = dp[i];
                idx = i;
            }
        }

        return map.get(idx);
    }
}
