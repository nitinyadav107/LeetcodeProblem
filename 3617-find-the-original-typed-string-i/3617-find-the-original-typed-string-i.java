class Solution {
    public int possibleStringCount(String word) {
        int c=1;
        int ans=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                c++;
            }
            else{
                ans+=(c-1);
                c=1;
            }
        }
        ans+=(c-1);
        return ans;
    }
}