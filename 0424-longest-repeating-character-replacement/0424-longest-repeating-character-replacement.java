class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int freq=0;
        int ans=0;
        int j=0;
        char element='a';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            if(freq<map.get(ch)){
                element=ch;
                freq=map.get(ch);
            }
            int size=i-j+1;
            while(size-freq>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++; 
                size=i-j+1;
            }
            ans=Math.max(size,ans);  
        }
        return ans;
    }
}