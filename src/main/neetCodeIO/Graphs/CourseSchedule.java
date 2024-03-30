package main.neetCodeIO.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinishBFS(int numCourses, int[][] prerequisites) {
        // Create adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        // Create an array to store the indegree of each course
        int[] indegree = new int[numCourses];

        // Populate the adjacency list and indegree array
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            adjList.get(prereq).add(course);
            indegree[course]++;
        }

        // Perform topological sorting using BFS
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int coursesTaken = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            coursesTaken++;

            for (int neighbor : adjList.get(course)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return coursesTaken == numCourses;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Create the adjacency list
        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[0]).add(prerequisite[1]);
        }

        // Initialize visited array
        int[] visited = new int[numCourses];

        // Check for cycles using DFS
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && isCyclic(adj, visited, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCyclic(List<List<Integer>> adj, int[] visited, int curr) {
        if (visited[curr] == 2) {
            return true;
        }

        visited[curr] = 2;
        for (int neighbor : adj.get(curr)) {
            if (visited[neighbor] != 1 && isCyclic(adj, visited, neighbor)) {
                return true;
            }
        }
        visited[curr] = 1;
        return false;
    }

}
