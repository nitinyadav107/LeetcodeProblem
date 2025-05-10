class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        long s1=0;
        int zero1=0;
        for(int i=0;i<n1;i++){
            if(nums1[i]==0) zero1++;
            s1+=nums1[i];
        }
        int n2=nums2.length;
        long s2=0;
        int zero2=0;
        for(int i=0;i<n2;i++){
            if(nums2[i]==0) zero2++;
            s2+=nums2[i];
        }
          if(s1+zero1==s2+zero2){
            return s1+zero1;
          }
        if(s1+zero1>s2+zero2){
            s1=s1+zero1;
            if(zero2!=0 && s1-s2>=zero2){
                return s1;
            }
            else return -1;
        }
         if(s1+zero1<s2+zero2){
           
            s2=s2+zero2;
            if(zero1!=0 && s2-s1>=zero1){
                return s2;
            }
            else
            {
                 return -1;
            }
            
        }
        return -1;
        

    }
}