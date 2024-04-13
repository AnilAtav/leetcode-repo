package main.neetCodeIO.Intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {

    //Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
    //Output: [[1,5],[6,9]]

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            // if newInterval bigger than current
            if (newInterval == null || interval[1] < newInterval[0])
                res.add(interval);
            // if newInterval small than current, add to result both
            else if (interval[0] > newInterval[1]) {
                res.add(newInterval);
                res.add(interval);
                newInterval = null;
            }
            // Handle overlapping intervals
            else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
