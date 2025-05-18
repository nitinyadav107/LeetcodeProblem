class Solution {
    int [] newcut;
    int [][] memo;
    int helper(int [] newcut,int left,int right){
        if(right-left==1) return 0;
        if(memo[left][right]!=-1) return memo[left][right];
        int ans=Integer.MAX_VALUE;
        for(int i=left+1;i<=right-1;i++){
            int cost=newcut[right]-newcut[left]+helper(newcut,left,i)+helper(newcut,i,right);
            ans=Math.min(ans,cost);
        }
        return memo[left][right]=ans;


    }
    public int minCost(int n, int[] cuts) {
        newcut=new int[cuts.length+2];
        newcut[0]=0;
        newcut[newcut.length-1]=n;
        int idx=1;
        for(int i=0;i<cuts.length;i++){
            newcut[idx++]=cuts[i];
        }
        Arrays.sort(newcut);
        int left=0,right=newcut.length-1;
        memo=new int [cuts.length+2][cuts.length+2];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return helper(newcut,left,right);
    }
}