package main.neetCodeIO;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame123 {

    //    jump1
    //    You are given an integer array nums. You are initially positioned at the array's first index, and each
    //    element in the array represents your maximum jump length at that position.
    //    Return true if you can reach the last index, or false otherwise.
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;

        // start with the second last index
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }

    // jump2
    // Input: nums = [2,3,1,1,4]
    // Output: 2
    // Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int n = nums.length;
        int jumps = 0, lastReached = 0, reachablePosition = 0;

        for (int i = 0; i < n - 1; i++) {
            reachablePosition = Math.max(reachablePosition, i + nums[i]);

            if (i == lastReached) {
                jumps++;
                lastReached = reachablePosition;
            }
        }
        return jumps;
    }

    // jump3
    // Input: arr = [4,2,3,0,3,1,2], start = 5
    // Output: true
    // Explanation:
    // All possible ways to reach at index 3 with value 0 are:
    // index 5 -> index 4 -> index 1 -> index 3
    // index 5 -> index 6 -> index 4 -> index 1 -> index 3
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int current = q.poll();

            if (arr[current] == 0)
                return true;

            //negative means already visited
            if (arr[current] < 0)
                continue;

            //try right and left indices
            if (current + arr[current] < arr.length) q.add(current + arr[current]);
            if (current - arr[current] >= 0) q.add(current - arr[current]);

            // mark each element as visited to prevent infinite loop
            arr[current] = -arr[current];
        }
        return false;
    }
}
