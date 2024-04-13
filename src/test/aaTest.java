package test;

import main.neetCodeIO.DynamicProgrammingOneD.ClimbingStairs;
import main.neetCodeIO.DynamicProgrammingOneD.CoinChange;
import main.neetCodeIO.DynamicProgrammingOneD.WordBreak;
import main.neetCodeIO.Graphs.*;
import main.neetCodeIO.Greedy.JumpGame123;
import main.neetCodeIO.Intervals.InsertIntervals;
import main.neetCodeIO.Sorting.SortQuickSort;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class aaTest {

    @Test
    public void aaTest() {

        InsertIntervals solution = new InsertIntervals();

        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}};
        int[] newInterval = {4, 8};


        int[][] result = solution.insert(intervals, newInterval);
    }

}
