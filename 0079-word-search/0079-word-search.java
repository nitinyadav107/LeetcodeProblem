class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] isVisited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean check = helper(board, isVisited, i, j, n, m, word, 0);
                if (check == true) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean helper(char[][] board, boolean[][] isVisited, int row, int col, int n, int m, String word, int index) {
        if (index == word.length()) return true;
        if (row < 0 || row >= n || col < 0 || col >= m || isVisited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }

        isVisited[row][col] = true;

        boolean found =
            helper(board, isVisited, row - 1, col, n, m, word, index + 1) ||
            helper(board, isVisited, row + 1, col, n, m, word, index + 1) ||
            helper(board, isVisited, row, col - 1, n, m, word, index + 1) ||
            helper(board, isVisited, row, col + 1, n, m, word, index + 1);

        isVisited[row][col] = false;

        return found;
    }
}
