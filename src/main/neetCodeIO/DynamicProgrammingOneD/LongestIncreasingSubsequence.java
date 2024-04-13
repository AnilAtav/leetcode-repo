package main.neetCodeIO.DynamicProgrammingOneD;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    //Given an integer array nums, return the length of the longest strictly increasing subsequence
    //Input: nums = [10,9,2,5,3,7,101,18]
    //Output: 4
    //Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    public int lengthOfLIS(int[] nums) {
        // Base case: If the input array is empty, return 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        // Create an array to store the length of the longest increasing subsequence ending at each index
        int[] dp = new int[n];

        // Initialize the array with 1 as the minimum length for each single element
        Arrays.fill(dp, 1);

        // Initialize a variable to store the maximum length of the increasing subsequence
        int maxLen = 1; // Initialize to 1 because the minimum length is 1 for any single element

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            // For each element at index i, compare it with all elements before it
            for (int j = 0; j < i; j++) {
                // If nums[i] is greater than nums[j], it can be part of the increasing subsequence
                if (nums[i] > nums[j]) {
                    // Update the length of the increasing subsequence ending at index i
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    // Update the maximum length of the increasing subsequence if necessary
                    maxLen = Math.max(maxLen, dp[i]);
                }
            }
        }

        return maxLen;
    }
}
