package main.neetCodeIO.SlidingWindow;

import java.util.HashMap;

public class SlidingWindowLongestSubstring {
    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3.

    //Input: s = "pwwkew"
    //Output: 3
    //Explanation: The answer is "wke", with the length of 3.
    //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> chrMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (chrMap.containsKey(currentChar)) {
                // Move the start pointer to the next position after the last occurrence of currentChar
                start = Math.max(chrMap.get(currentChar) + 1, start);
            }

            // Update the index of the currentChar in the map
            chrMap.put(currentChar, end);

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

