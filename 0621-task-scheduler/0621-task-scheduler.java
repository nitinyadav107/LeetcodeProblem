class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] arr=new int[26];
        for(int i=0;i<tasks.length;i++){
            arr[tasks[i]-'A']++;
        }
          PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                maxHeap.add(arr[i]);
            }
        }
        int time=0;
        while(!maxHeap.isEmpty()){
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=1;i<=n+1;i++){
                if(!maxHeap.isEmpty()){
                    int top=maxHeap.poll();
                    top--;
                    a.add(top);
                }

            }
            for(Integer x:a){
                if(x>0){
                 maxHeap.add(x);
                }
            }
            if(maxHeap.isEmpty()){
                time+=a.size();
            }
            else{
                time+=(n+1);
            }
        }
        return time;

    }
}