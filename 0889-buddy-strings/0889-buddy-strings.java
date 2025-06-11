class Solution {
    boolean checker(String s){
        int [] count=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'a']++;
        }
        for(int x:count){
            if(x>=2) return true;
        }
        return false;
    }
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
       if(s.equals(goal)){
            return checker(s);
        }
        else{
            int c=0;
            int idx1=-1;
            int idx2=-1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=goal.charAt(i)){
                    c++;
                    if(idx1!=-1) idx2=i;
                    if(idx1==-1) idx1=i;
                }
                if(c>2) return false;
            }
            if(c==2){
                if(s.charAt(idx2)==goal.charAt(idx1) && s.charAt(idx1)==goal.charAt(idx2)) return true;
            }
        }
        return false;
    }
}