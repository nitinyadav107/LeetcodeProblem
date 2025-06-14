class Solution {
    public int minMaxDifference(int num) {
        ArrayList<Integer> ans=new ArrayList<>();
        while(num>0){
            ans.add(num%10);
            num=num/10;
        }
        Collections.reverse(ans);
        int num1=-1;
        int num2=-1;
        for(int i=0;i<ans.size();i++){
            if(num1==-1 && ans.get(i)<9){
                num1=ans.get(i);
            }
            if(num2==-1 && ans.get(i)>0){
                num2=ans.get(i);
            }
        }
        String x="";
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==num1){
                x+=9;
            }
            else{
                x+=ans.get(i);
            }
            
        }
        String y="";
         for(int i=0;i<ans.size();i++){
            if(ans.get(i)==num2){
                y+=0;
            }
            else{
                y+=ans.get(i);
            }
         }
        return Integer.parseInt(x)-Integer.parseInt(y);
        
    }
}