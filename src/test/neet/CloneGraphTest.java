package test.neet;

import main.TwoSum;
import main.neetCodeIO.Graphs.CloneGraph;
import main.neetCodeIO.Graphs.GraphNode;
import org.junit.Before;
import org.junit.Test;

public class CloneGraphTest {

    CloneGraph cloneGraph;

    @Before
    public void setUp() {
        cloneGraph = new CloneGraph();
    }

    @Test
    public void testTwoSum() {

        // Create nodes
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);

        // Add neighbors
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);

        // Perform deep copy
        GraphNode copiedGraph = cloneGraph.deepCopyGraph(node1);

        // Print the original graph
        System.out.println("Original Graph:");
        CloneGraph.printGraph(node1);

        // Print the copied graph
        System.out.println("\nCopied Graph:");
        CloneGraph.printGraph(copiedGraph);
    }
}
