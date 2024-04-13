package main.neetCodeIO.GraphBFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Arrays;

public class MinimumGeneticMutation {

    //Input: startGene = "AACCGGTT", endGene = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
    //Output: 2
    //exp: The mutations of "AACCGGTT" are:
    //"AACCGGTA" (already in the bank and not visited, add to queue and visited)
    //"AACCGGTC" (not in the bank)
    //"AACCGGTA" (already visited)
    //So, we enqueue "AACCGGTA" into the queue and mark it as visited.

    public int minMutation(String start, String end, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(end)) return -1; // If the end mutation is not in the bank, it's impossible

        Set<String> visited = new HashSet<>(); // Set to keep track of visited mutations
        Queue<String> queue = new LinkedList<>(); // Queue for BFS traversal
        queue.offer(start); // Add the start mutation to the queue
        visited.add(start); // Mark start mutation as visited

        int mutations = 0; // Initialize the number of mutations

        while (!queue.isEmpty()) {
            int size = queue.size(); // Get the current size of the queue
            for (int i = 0; i < size; i++) {
                String curr = queue.poll(); // Dequeue the current mutation

                if (curr.equals(end)) return mutations; // If we reach the end mutation, return the number of mutations

                // Generate all possible mutations from the current mutation
                for (int j = 0; j < curr.length(); j++) {
                    char[] chars = curr.toCharArray();
                    for (char c : new char[]{'A', 'C', 'G', 'T'}) {
                        chars[j] = c; // Replace each character with A, C, G, T
                        String nextMutation = new String(chars); // Create the next mutation
                        if (!visited.contains(nextMutation) && bankSet.contains(nextMutation)) {
                            // If the next mutation is in the bank and not visited, enqueue it and mark as visited
                            queue.offer(nextMutation);
                            visited.add(nextMutation);
                        }
                    }
                }
            }
            mutations++; // Increment the number of mutations after processing each level of mutations
        }

        return -1; // If end mutation cannot be reached
    }
}
