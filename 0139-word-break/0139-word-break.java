class Solution {
    Boolean[] memo;

    boolean helper(String s, int idx, HashMap<String, Integer> map) {
        if (idx == s.length()) {
            return true;
        }

        if (memo[idx] != null) return memo[idx];

        String st = "";
        for (int i = idx; i < s.length(); i++) {
            st = s.substring(idx, i + 1);
            if (map.containsKey(st)) {
                if (helper(s, i + 1, map)) {
                    return memo[idx] = true;
                }
            }
        }

        return memo[idx] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new Boolean[s.length()];
        HashMap<String, Integer> map = new HashMap<>();
        for (String key : wordDict) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return helper(s, 0, map);
    }
}
