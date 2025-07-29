class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair<Integer,Integer>> st=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(new Pair(arr[i],i));
                arr[i]=0;
            }
            else{
                while(!st.isEmpty() && st.peek().getKey()<=arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    int x=arr[i];
                    arr[i]=st.peek().getValue()-i;
                    st.push(new Pair(x,i));
                }
                else{
                    st.push(new Pair(arr[i], i));
                    arr[i]=0;
                }
            }
        }
        return arr;
    }
}