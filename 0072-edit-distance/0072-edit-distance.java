class Solution {
    int [][]dp=new int[501][501];
    int helper(String word1,String word2,int n1,int n2,int i1,int i2){
        if(i1==n1) return n2-i2;
        if(i2==n2) return n1-i1;
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        if(word1.charAt(i1)==word2.charAt(i2)) return dp[i1][i2]=helper(word1,word2,n1,n2,i1+1,i2+1);
        int insert=1+helper(word1,word2,n1,n2,i1,i2+1);
        int delete=1+helper(word1,word2,n1,n2,i1+1,i2);
        int replace=1+helper(word1,word2,n1,n2,i1+1,i2+1);
        return dp[i1][i2]=Math.min( Math.min(insert,delete),replace);
    }
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        for(int i=0;i<501;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(word1,word2,n1,n2,0,0);
    }
}