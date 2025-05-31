class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] nstr=new int [n];
        Arrays.fill(nstr,n);
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nstr[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        int [] nstl=new int [n];
        Arrays.fill(nstl,-1);
        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nstl[i] = stack.peek();
            }
            stack.push(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nstr[i]-nstl[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
}