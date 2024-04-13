package main.neetCodeIO.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedIntervals {

    //Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //Output: [[1,6],[8,10],[15,18]]
    //Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // Step 1: Sort intervals based on start values
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];

        // Step 2: Merge intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            // If there's an overlap, update end value of current interval
            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // No overlap, add current interval to merged intervals list
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last merged interval
        mergedIntervals.add(currentInterval);

        // Convert list to array and return
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

}
