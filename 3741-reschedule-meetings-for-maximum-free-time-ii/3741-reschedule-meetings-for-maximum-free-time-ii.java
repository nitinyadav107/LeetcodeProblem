class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        ArrayList<Integer> freeArray=new ArrayList<>();
        freeArray.add(startTime[0]);
        int n=startTime.length;
        for(int i=1;i<n;i++){
            freeArray.add(startTime[i]-endTime[i-1]);
        }
        freeArray.add(eventTime-endTime[n-1]);
        int n1=freeArray.size();
        int [] leftMax=new int[n1];
        int [] rightMax=new int[n1];
        for(int i=1;i<n1;i++){
            leftMax[i]=Math.max(leftMax[i-1],freeArray.get(i-1));
        }
        for(int i=n1-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],freeArray.get(i+1));
        }
       int result = 0;
        for (int i = 1; i < n1; i++) {
            int currEventTime = endTime[i - 1] - startTime[i - 1];
            
            if (currEventTime <= Math.max(leftMax[i - 1], rightMax[i])) {
                result = Math.max(result, freeArray.get(i - 1) + currEventTime + freeArray.get(i));
                
            }
            result = Math.max(result, freeArray.get(i - 1) + freeArray.get(i));
        }
        return result;

    }
}