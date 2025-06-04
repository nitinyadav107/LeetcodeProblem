class Solution {
    public int minCostToMoveChips(int[] position) {
        int coin0=0;
        int coin1=0;
        int n=position.length;
        for(int i=0;i<n;i++){
            if(position[i]%2==0){
                coin0++;
            }
            else{
                coin1++;
            }
        }
        return coin0>coin1?coin1:coin0;

    }
}