package main.neetCodeIO;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingCombinations {

    //Input: n = 4, k = 2
    //Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
    //Explanation: There are 4 choose 2 = 6 total combinations.
    //Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(1, n, k, path, res);
        return res;
    }
    public void backtrack(int index, int n, int k, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i <= n; i++) {
            path.add(i);
            backtrack(i + 1, n, k, path, res);
            path.remove(path.size() - 1);
        }
    }

}
