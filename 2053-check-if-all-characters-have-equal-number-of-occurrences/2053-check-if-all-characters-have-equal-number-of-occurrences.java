class Solution {
    public boolean areOccurrencesEqual(String s) {
         int n = s.length();
        int[] ans = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            ans[ch - 'a']++;
        }
        int x=-1;
        for(int i=0;i<ans.length;i++){
           if (ans[i] != 0) {
                if (x != -1 && x != ans[i]) {
                    return false;
                }
                x = ans[i];
            }
        }
        return true;
    }
}