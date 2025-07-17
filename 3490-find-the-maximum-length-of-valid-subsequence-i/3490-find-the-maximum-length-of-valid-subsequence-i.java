class Solution {
    public int maximumLength(int[] nums) {
        int odd=0;
        int n=nums.length;
        for(int x:nums){
            if(x%2!=0){
                odd++;
            }
        }
        int even=0;
        for(int x:nums){
            if(x%2==0){
                even++;
            }
        }
        int altodd=0;
        boolean checkodd=true;
        for(int x:nums){
            if(checkodd==true && x%2!=0){
                altodd++;
                checkodd=false;
            }
            else if(checkodd==false && x%2==0){
                checkodd=true;
                altodd++;
            }
        }
        int alteven=0;
        boolean checkeven=true;
        for(int x:nums){
            if(checkeven==true && x%2==0){
                alteven++;
                checkeven=false;
            }
            else if(checkeven==false && x%2!=0){
                checkeven=true;
                alteven++;
            }
        }
        return Math.max(alteven,Math.max(altodd,Math.max(odd,even)));
    }
}