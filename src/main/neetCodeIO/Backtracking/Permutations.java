package main.neetCodeIO.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    //Given an array nums of distinct integers, return all the possible permutations.
    //Input: nums = [1,2,3]
    //Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    public List<List<Integer>> permutations(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }

    private void backtrack(List<List<Integer>> resultSet, ArrayList<Integer> tempSet, int[] nums) {

        if(tempSet.size() == nums.length){
            resultSet.add(new ArrayList<>(tempSet));
            return;
        }

        for (int number : nums){
            if (tempSet.contains(number))
                continue;

            tempSet.add(number);

            backtrack(resultSet, tempSet, nums);

            tempSet.remove(tempSet.size()-1);
        }
    }
}
