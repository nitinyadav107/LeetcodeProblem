class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int np=players.length;
        int nt=trainers.length;
        int i=0;
        int j=0;
        int c=0;
        while(i<np && j<nt){
            if(players[i]<=trainers[j]){
                c++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return c;
    }
}