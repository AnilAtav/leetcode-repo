package main.neetCodeIO.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingCombinationSum {

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

    private List<List<Integer>> ans = new ArrayList<>();
    private ArrayList<Integer> ls = new ArrayList<>();
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
