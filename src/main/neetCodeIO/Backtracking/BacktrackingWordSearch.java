package main.neetCodeIO.Backtracking;

public class BacktrackingWordSearch {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Loop through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell matches the first character of the word
                if (board[i][j] == word.charAt(0)) {
                    // Use DFS to try to find the word starting from the current cell
                    if (dfs(board, word, i, j, 0)) {
                        return true; // If found, return true
                    }
                }
            }
        }

        return false; // If not found in any cell, return false
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // Base case: If we have reached the end of the word, return true
        if (index == word.length()) {
            return true;
        }

        // Check boundary conditions and if the current cell matches the current character of the word
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore adjacent cells in DFS
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) ||
                dfs(board, word, i, j - 1, index + 1);

        // Restore the original value of the current cell
        board[i][j] = temp;

        return found; // Return the result of DFS exploration
    }

}
