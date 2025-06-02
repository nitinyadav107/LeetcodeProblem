class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            if(st.isEmpty() || asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                boolean check=false;
                while(!st.isEmpty() && st.peek()>0){
                    if(Math.abs(st.peek())<Math.abs(asteroids[i])){
                        st.pop();
                    }
                    else if(Math.abs(st.peek())==Math.abs(asteroids[i])){
                        st.pop();
                        check=true;
                        break;

                    }
                    else{
                        check=true;
                        break;
                    }
                }
                if(check==false) st.push(asteroids[i]);
            }
        }
        int []ans=new int [st.size()];
        int idx=st.size()-1;
        while(!st.isEmpty()){
            ans[idx--]=st.pop();
        }
        return ans;
    }
}