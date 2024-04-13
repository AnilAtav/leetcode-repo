package main.neetCodeIO.GraphBFS;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {

    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n + 1]; // Keep track of visited cells
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0}); // Start from cell 1 with 0 moves

        // BFS traversal
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            for (int j = 1; j <= 6; j++) {
                int next = curr[0] + j;
                int[] coor = squareToCoor(next, n);
                if (board[coor[0]][coor[1]] != -1) {
                    next = board[coor[0]][coor[1]]; // Adjust next cell if it's a ladder or snake
                }
                if (next == n * n) {
                    return curr[1] + 1; // Reached the last cell
                }
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(new int[]{next, curr[1] + 1}); // Enqueue next cell with incremented moves
                }
            }
        }

        return -1; // Impossible to reach the last cell
    }

    // Helper method to convert a cell number to row and column indices
    private int[] squareToCoor(int cell, int n) {
        int row = (n - 1) - (cell - 1) / n;
        int col = ((cell - 1) / n) % 2 == 0 ? (cell - 1) % n : n - 1 - (cell - 1) % n;
        return new int[]{row, col};
    }
}
