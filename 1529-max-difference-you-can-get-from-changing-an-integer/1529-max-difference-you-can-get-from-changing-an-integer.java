class Solution {
    public int maxDiff(int num) {
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
            if(num2==-1 && ans.get(i)>1){
                num2=i;
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
            if(num2>0 && ans.get(i)== ans.get(num2)){
                y+=0;
            }
            else if(num2==0 && ans.get(i)== ans.get(num2)){
                y+=1;
            }
            else{
                y+=ans.get(i);
            }
         }
        return Integer.parseInt(x)-Integer.parseInt(y);
    }
}