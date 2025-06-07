class Solution {
    public char repeatedCharacter(String s) {
        int [] ans=new int[s.length()];
        int n=s.length();
        Arrays.fill(ans,n);
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    ans[i]=j;
                    break;
                }
            }
        }
        int min=n;
        for(int i=0;i<n;i++){
            min=Math.min(min,ans[i]);
        }
        return s.charAt(min);
    }
}