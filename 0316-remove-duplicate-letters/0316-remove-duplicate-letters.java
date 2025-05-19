class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        int [] count=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            count[ch-'a']=i;
        }
        boolean [] occur=new boolean[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(occur[ch-'a']) continue;
            while(ans.length()>0 && ans.charAt(ans.length()-1)>ch && count[ans.charAt(ans.length()-1)-'a']>i){

                    occur[ans.charAt(ans.length()-1)-'a']=false;
                    ans.deleteCharAt(ans.length()-1);

                
            
            }
            if(occur[ch-'a']==false){
                occur[ch-'a']=true;
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}