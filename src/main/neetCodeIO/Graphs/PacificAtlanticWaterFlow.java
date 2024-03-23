package main.neetCodeIO.Graphs;

import java.util.*;

public class PacificAtlanticWaterFlow {
    //Explanation: The following cells can flow to the Pacific and Atlantic oceans, as shown below:
    //int[][] matrix = {
    //            {1, 2, 2, 3, 5},
    //            {3, 2, 3, 4, 4},
    //            {2, 4, 5, 3, 1},
    //            {6, 7, 1, 4, 5},
    //            {5, 1, 1, 2, 4}
    //        };
    //Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]

    private int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private List<List<Integer>> result = new ArrayList<>();


    public List<List<Integer>> pacificAtlanticBFS(int[][] heights) {
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] canReachPacific = new boolean[rows][cols];
        boolean[][] canReachAtlantic = new boolean[rows][cols];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        // Add border cells to the queues (starting points for BFS) | Vertical
        for (int i = 0; i < rows; i++) {
            pacificQueue.offer(new int[]{i, 0});
            atlanticQueue.offer(new int[]{i, cols - 1});
            canReachPacific[i][0] = true;
            canReachAtlantic[i][cols - 1] = true;
        }
        for (int j = 0; j < cols; j++) { // Horizontal
            pacificQueue.offer(new int[]{0, j});
            atlanticQueue.offer(new int[]{rows - 1, j});
            canReachPacific[0][j] = true;
            canReachAtlantic[rows - 1][j] = true;
        }

        // Perform BFS from border cells for both oceans
        bfs(heights, canReachPacific, pacificQueue);
        bfs(heights, canReachAtlantic, atlanticQueue);

        // Find cells that can reach both oceans
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }

        return result;
    }

    private void bfs(int[][] heights, boolean[][] canReach, Queue<int[]> queue) {
        int rows = heights.length;
        int cols = heights[0].length;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !canReach[newRow][newCol]
                        && heights[newRow][newCol] >= heights[row][col]) {
                    canReach[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }



    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] pacificReachable = new boolean[rows][cols];
        boolean[][] atlanticReachable = new boolean[rows][cols];

        // Traverse top and bottom borders
        for (int col = 0; col < cols; col++) {
            dfs(matrix, 0, col, Integer.MIN_VALUE, pacificReachable);
            dfs(matrix, rows - 1, col, Integer.MIN_VALUE, atlanticReachable);
        }

        // Traverse left and right borders
        for (int row = 0; row < rows; row++) {
            dfs(matrix, row, 0, Integer.MIN_VALUE, pacificReachable);
            dfs(matrix, row, cols - 1, Integer.MIN_VALUE, atlanticReachable);
        }

        // Find cells that are reachable from both oceans
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] matrix, int row, int col, int prevVal, boolean[][] reachable) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check boundaries and if the cell is reachable
        if (row < 0 || row >= rows || col < 0 || col >= cols || reachable[row][col] || matrix[row][col] < prevVal) {
            return;
        }

        reachable[row][col] = true;

        // Recursively visit neighbors
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            dfs(matrix, newRow, newCol, matrix[row][col], reachable);
        }
    }
}
