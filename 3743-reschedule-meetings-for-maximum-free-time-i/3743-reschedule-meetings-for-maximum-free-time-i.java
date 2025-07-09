class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        ArrayList<Integer> freeTime=new ArrayList<>();
        freeTime.add(startTime[0]);
        int n=startTime.length;
        for(int i=1;i<n;i++){
            freeTime.add(startTime[i]-endTime[i-1]);
        }
        freeTime.add(eventTime-endTime[n-1]);
        int i=0;
        int j=0;
        int n1=freeTime.size();
        int maxFree=0;
        int currSum=0;
        while(i<n1){
            currSum+=freeTime.get(i);
            if(j<n1 && i-j+1>k+1){
                currSum-=freeTime.get(j);
                j++;

            }
            i++;
            maxFree=Math.max(maxFree,currSum);
        }
        return maxFree;
    }
}