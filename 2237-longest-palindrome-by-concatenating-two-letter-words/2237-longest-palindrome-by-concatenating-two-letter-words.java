class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int ans=0;
        for(String s1:words){
            String s="";
            s+=s1.charAt(1);
            s+=s1.charAt(0);
            if(map.containsKey(s)){
                ans+=4;
                map.put(s,map.get(s)-1);
                if(map.get(s)==0) map.remove(s);
            }
            else{
               map.put(s1, map.getOrDefault(s1, 0) + 1);

            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String s=entry.getKey();
            if(s.charAt(0)==s.charAt(1)){
                ans+=entry.getValue()*2;
                break;
            }
        }
        return ans;

    }
}