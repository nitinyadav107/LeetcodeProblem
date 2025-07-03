class Solution {
    public char kthCharacter(int k) {
        String s="a";
        while(s.length()<k){
            String s1="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='z'){
                    s1+='a';
                }
                else{
                    s1+=(char)(s.charAt(i)+1);
                }   
            }
            s+=s1;
            if(s.length()>=k){
                return s.charAt(k-1);
            }
        }
        return 'a';
        
    }
}