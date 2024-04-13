package main.neetCodeIO.Hashmap;

import java.util.Arrays;

public class LongestConsecutive {
    //Input: nums = [100,4,200,1,3,2]
    //Output: 4
    //Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

    //[9,1,4,7,3,-1,0,5,8,-1,6]
    public int longestConsecutive(int[] nums) {
        int numLength = nums.length;

        if (numLength == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int cnt = 1;
        int maxi = 0;

        for (int i = 1; i < numLength; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {//consecutive
                    cnt++;
                } else {//store current max count and search if there are more
                    maxi = Math.max(maxi, cnt);
                    cnt = 1;
                }
            }
        }

        return Math.max(maxi, cnt);
    }
}
