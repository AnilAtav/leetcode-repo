package main.neetCodeIO.Graphs;

import java.util.LinkedList;
import java.util.Queue;

// find how many islands
// Input: char[][] grid = {
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '0', '0', '0'},
//                {'0', '0', '0', '1', '1'}
//        };
// Output: 2
public class NumberOfIslands {

    // efficient leetcode solution
    public int numIslandsLeetSolution(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int count = 0;

        // Traverse each cell of the grid
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == '1') {
                    bfsLeetSolution(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfsLeetSolution(int i, int j, char[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        // Mark current cell as visited
        grid[i][j] = '2';

        // BFS traversal in four directions
        if (i - 1 >= 0 && grid[i - 1][j] == '1') {
            bfsLeetSolution(i - 1, j, grid);
        }
        if (i + 1 < rowLength && grid[i + 1][j] == '1') {
            bfsLeetSolution(i + 1, j, grid);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1') {
            bfsLeetSolution(i, j - 1, grid);
        }
        if (j + 1 < colLength && grid[i][j + 1] == '1') {
            bfsLeetSolution(i, j + 1, grid);
        }
    }



    // iterative bfs and dfs solution
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int numIslands = 0;

        // Visited matrix to track visited cells
        boolean[][] visited = new boolean[rows][cols];

        // Define directions (up, down, left, right)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS traversal
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    numIslands++; // Found a new island
                    visited[i][j] = true; // Mark current cell as visited
                    bfs(grid, visited, i, j, directions); // Perform BFS from the current cell
                }
            }
        }

        return numIslands;
    }

    private void bfs(char[][] grid, boolean[][] visited, int row, int col, int[][] directions) {
        int rows = grid.length;
        int cols = grid[0].length;

        // BFS traversal using queue
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col}); // Add current cell to the queue

        // Explore neighboring cells using BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            // Explore neighbors in all four directions
            for (int[] dir : directions) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];

                // Check if the new cell is within the grid bounds and is part of an island
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true; // Mark the new cell as visited
                    queue.offer(new int[]{newRow, newCol}); // Add new cell to the queue
                }
            }
        }
    }

    private void dfs(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0'; // Mark current cell as visited
        dfs(grid, row + 1, col); // Explore down
        dfs(grid, row - 1, col); // Explore up
        dfs(grid, row, col + 1); // Explore right
        dfs(grid, row, col - 1); // Explore left
    }
}
