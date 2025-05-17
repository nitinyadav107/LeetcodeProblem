class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Integer> > queue=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j));
                }
                 else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;

        if(queue.size()==0) return -1;
        int size=queue.size();
        int ans=0;
        while(size>0){
            Pair<Integer,Integer> x=queue.poll();
             int row = x.getKey();
             int col = x.getValue();
            if(col+1<n && grid[row][col+1]!=0 && grid[row][col+1]!=2){
                grid[row][col+1]=2;
                queue.add(new Pair(row,col+1));
                fresh--;
            }
            if(row+1<m && grid[row+1][col]!=0 && grid[row+1][col]!=2){
                grid[row+1][col]=2;
                queue.add(new Pair(row+1,col));
                fresh--;
            }
            if(col-1>=0 && grid[row][col-1]!=0 && grid[row][col-1]!=2){
                grid[row][col-1]=2;
                queue.add(new Pair(row,col-1));
                fresh--;
            }
            if(row-1>=0 && grid[row-1][col]!=0 && grid[row-1][col]!=2){
                grid[row-1][col]=2;
                queue.add(new Pair(row-1,col));
                fresh--;
            }
            size--;
            if(size==0){
                size=queue.size();
                 ans++;
            }
        }
        return fresh==0? ans-1:-1;
    }
}