package main.neetCodeIO.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BacktrackingCombinationSum {
    private List<List<Integer>> ans = new ArrayList<>();
    private ArrayList<Integer> ls = new ArrayList<>();

    //find all unique combinations in candidates where the candidate numbers sum to target.
    //Each number in candidates may only be used once in the combination.
    //Input: candidates = [10,1,2,7,6,1,5], target = 8
    //Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        cum2(candidates,target,0);
        return ans;
    }
    public void cum2(int[] candidates, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            //if we are at the starting position and if its a duplicate
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] <= target) {
                ls.add(candidates[i]);
                cum2(candidates, target - candidates[i], i+1);
                ls.remove(ls.size() - 1);
            }
        }
    }


    //Input: candidates = [2,3,6,7], target = 7
    //Output: [[2,2,3],[7]]
    //Explanation:
    //2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    //7 is a candidate, and 7 = 7.
    //These are the only two combinations.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        cum(candidates,target,0);
        return ans;
    }

    public void cum(int[] c, int target, int start) {
        System.out.println("Current state: ls=" + ls + ", target=" + target + ", start=" + start);

        // Base case: If the target is 0, add the current combination to the result.
        if (target == 0) {
            System.out.println("Base case reached. Adding " + ls + " to the result.");
            ans.add(new ArrayList<>(ls));
            return;
        }

        // Iterate through candidates starting from the given index.
        for (int i = start; i < c.length; i++) {
            if (c[i] <= target) {
                // Add the current candidate to the combination.
                ls.add(c[i]);
                System.out.println("Adding " + c[i] + " to ls. Calling cum with new state: ls=" + ls + ", target=" + (target - c[i]) + ", start=" + i);

                // Recursive call with updated target and the same starting index.
                cum(c, target - c[i], i);

                // Backtrack: Remove the last added element before trying the next candidate.
                ls.remove(ls.size() - 1);
                System.out.println("Backtracking. Removing last element. New state: ls=" + ls);
            }
        }
        System.out.println("End of cum for start=" + start);
    }
}
