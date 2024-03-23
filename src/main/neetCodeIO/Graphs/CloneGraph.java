package main.neetCodeIO.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    // Return a deep copy (clone) of the graph.

    private Map<GraphNode, GraphNode> visited = new HashMap<>();

    public GraphNode deepCopyGraph(GraphNode graphNode) {
        if (graphNode == null) return null;

        // If the node has already been visited, return its clone
        if (visited.containsKey(graphNode)) return visited.get(graphNode);

        // Create a clone for the current node
        GraphNode cloneGraphNode = new GraphNode(graphNode.val);
        visited.put(graphNode, cloneGraphNode);

        // Iterate through the neighbors of the current node
        for (GraphNode neighbor : graphNode.neighbors) {
            // Recursively clone the neighbors and add them to the cloned node's neighbors list
            cloneGraphNode.neighbors.add(deepCopyGraph(neighbor));
        }

        return cloneGraphNode;
    }





    // Method to print the graph
    public static void printGraph(GraphNode node) {
        if (node == null) return;

        Map<GraphNode, Boolean> visited = new HashMap<>();
        printDFS(node, visited);
    }

    // DFS traversal to print the graph
    private static void printDFS(GraphNode node, Map<GraphNode, Boolean> visited) {
        visited.put(node, true);
        System.out.print(node.val + " ");

        for (GraphNode neighbor : node.neighbors) {
            if (!visited.containsKey(neighbor)) {
                printDFS(neighbor, visited);
            }
        }
    }
}
