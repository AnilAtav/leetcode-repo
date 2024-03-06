package test;

import main.neetCodeIO.Backtracking.BacktrackingCombinationSum;
import org.junit.Test;

import java.util.*;

public class aaTest {

    @Test
    public void aaTest() {

        BacktrackingCombinationSum solution = new BacktrackingCombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Final result: " + result);



    }
}
