class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int odd=0,even=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                odd=Math.max(odd,entry.getValue());
            }
            else{
                even=Math.min(even,entry.getValue());
            }
        }
        return odd-even;
    }
}