package main.neetCodeIO;

public class SlidingWindowMinSubArrayLen {

    //return the minimal length of a subarray whose sum is greater than or equal to target
    //Input: target = 7, nums = [2,3,1,2,4,3]
    //Output: 2
    //Explanation: The subarray [4,3] has the minimal length under the problem constraint.
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = 0, minLen = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end];

            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }

            end++;
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
