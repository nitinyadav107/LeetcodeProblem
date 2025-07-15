class Solution {
    public boolean isValid(String word) {
        if(word.length() <3) return false;
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        int count=0;
        int count1=0;
        for(char ch:word.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
            else if(!set.contains(ch) && ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z' ))){
                count1++;
            }
            else if(!(ch>='0' && ch<='9')){
                return false;
            }
        }
        if(count1==0 || count==0) return false;
        return true;
    }
}