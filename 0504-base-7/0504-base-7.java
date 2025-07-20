class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder ans=new StringBuilder();
        int x=Math.abs(num);
        while(x!=0){
            ans.append(x%7);
            x=x/7;
        }
        if(num<0) return "-"+ans.reverse().toString();
        return ans.reverse().toString();
    }
}