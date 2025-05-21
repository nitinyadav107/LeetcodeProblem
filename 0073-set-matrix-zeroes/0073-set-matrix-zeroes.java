class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashSet<Pair<Integer,Integer>>set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    set.add(new Pair(i,j));
                }
            }
        }
        for(Pair<Integer,Integer> x:set){
            for(int i=0;i<n;i++){
                matrix[x.getKey()][i]=0;
            }
            for(int i=0;i<m;i++){
                matrix[i][x.getValue()]=0;
            }

        }
    }
}