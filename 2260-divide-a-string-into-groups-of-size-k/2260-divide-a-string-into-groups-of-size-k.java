class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int length=0;
        if(n%k==0) length=n/k;
        else length=n/k+1;
        String [] ans=new String [length];
        int idx=0;
        for(int i=0;i<n;i+=k){
            String s1=(i+k<=n)?s.substring(i,i+k):s.substring(i,n);
            if(s1.length()==k){
                ans[idx++]=s1;
            }
            else{
                int n1=s1.length();
                for(int l=0;l<k-n1;l++){
                    s1+=fill;
                }
                ans[idx++]=s1;
            }
        }
        return ans;
        
    }
}