package main.neetCodeIO.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    //Given an integer array nums of unique elements, return all possible subsets (the power set).
    //Input: nums = [1,2,3]
    //Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }

    private void backtrack(List<List<Integer>> resultSet, List<Integer> tempSet, int[] nums, int start) {

        resultSet.add(new ArrayList<>(tempSet));

        for (int i=start;i< nums.length;i++){
            tempSet.add(nums[i]);

            backtrack(resultSet, tempSet, nums, i+1);

            tempSet.remove(tempSet.size()-1);
        }
    }

}
