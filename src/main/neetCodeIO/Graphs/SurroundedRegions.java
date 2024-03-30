package main.neetCodeIO.Graphs;

public class SurroundedRegions {

    //task is to capture all regions surrounded by 'X'.
    //X X X X       X X X X
    //X O O X ->    X X X X
    //X X O X       X X X X
    //X O X X       X 0 X X

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        // Traverse the first and last rows
        for (int col = 0; col < cols; col++) {
            dfs(board, 0, col);          // Top row
            dfs(board, rows - 1, col);   // Bottom row
        }

        // Traverse the first and last columns (except corners)
        for (int row = 1; row < rows - 1; row++) {
            dfs(board, row, 0);          // Leftmost column
            dfs(board, row, cols - 1);   // Rightmost column
        }

        // Convert 'O' to 'X' and '*' to 'O'
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                } else if (board[row][col] == '*') {
                    board[row][col] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != 'O') {
            return;
        }

        // Mark the current cell as visited by changing 'O' to '*'
        board[row][col] = '*';

        // Recursively visit neighboring cells
        dfs(board, row - 1, col); // Up
        dfs(board, row + 1, col); // Down
        dfs(board, row, col - 1); // Left
        dfs(board, row, col + 1); // Right
    }
}
