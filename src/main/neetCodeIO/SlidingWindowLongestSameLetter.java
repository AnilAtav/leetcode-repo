package main.neetCodeIO;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowLongestSameLetter {

    //Input: s = "AABABBA", k = 1
    //Output: 4
    //Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
    //The substring "BBBB" has the longest repeating letters, which is 4.
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int maxCount = 0; // Track the maximum frequency of any character in the current window

        Map<Character, Integer> charMap = new HashMap<>();

        for(int end=0; end<n; end++){
            char currentChar = s.charAt(end);
            //add char to map
            charMap.put(currentChar, charMap.getOrDefault(currentChar,0)+1);
            //get that chars count in map
            maxCount = Math.max(maxCount, charMap.get(currentChar));

            //shrink the window by moving the start pointer
            //if number of chars to be changed is greater than k
            while(end-start+1-maxCount>k){
                charMap.put(s.charAt(start), charMap.get(s.charAt(start))-1);
                start++;
            }

            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}
