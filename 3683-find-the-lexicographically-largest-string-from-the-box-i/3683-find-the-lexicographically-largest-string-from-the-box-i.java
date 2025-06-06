class Solution {
    public String answerString(String word, int numFriends) {
        int n=word.length()-(numFriends-1);
        if(numFriends==1) return word;
        String ans="a";
        for(int i=0;i<word.length();i++){
            String s=(i+n<=word.length())?word.substring(i,i+n):word.substring(i,word.length());
            if(s.compareTo(ans)>=0) ans=s;
        }
       
        return ans;
    }
}