class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            HashSet<Character> set=new HashSet<>();
            String s=words[i];
            for(int j=0;j<s.length();j++){
                set.add(s.charAt(j));
            }
            if(set.contains(x)){
                ans.add(i);
            }
        }
        return ans;
    }
}