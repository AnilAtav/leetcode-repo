package main.neetCodeIO.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

    //Input: s = "ADOBECODEBANC", t = "ABC"
    //Output: "BANC"
    //Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

    public String minWindow(String s, String t) {
        int start = 0;

        // Create a map to store the count of characters in string t
        Map<Character, Integer> charMapT = new HashMap<>();

        for (char c : t.toCharArray()) {
            charMapT.put(c, charMapT.getOrDefault(c, 0) + 1);
        }

        // Initialize the ending index of the window, minimum length, starting index of the minimum window,
        // and the count of required characters
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = t.length();

        // Loop through the characters of string s
        while (end < s.length()) {
            // Process the character at the end of the window
            char currChar = s.charAt(end);

            // If the character is present in string t, update the count in the character map
            if (charMapT.containsKey(currChar)) {
                if (charMapT.get(currChar) > 0) {
                    requiredChars--;
                }
                charMapT.put(currChar, charMapT.get(currChar) - 1);
            }

            // If all required characters are found in the current window
            while (requiredChars == 0) {
                // Update the minimum length and starting index of the window if needed
                if (end - start < minLen) {
                    minLen = end - start;
                    minStart = start;
                }

                // Process the character at the start of the window
                char startChar = s.charAt(start);

                // If the character is present in string t, update the count in the character map
                if (charMapT.containsKey(startChar)) {
                    charMapT.put(startChar, charMapT.get(startChar) + 1);
                    if (charMapT.get(startChar) > 0) {
                        requiredChars++;
                    }
                }

                // Move the start pointer to the right
                //we enter the inner loop to shrink the window from the left (start pointer)
                // until we no longer have all required characters. this way we can search an other char match pair
                start++;
            }

            // Move the end pointer to the right
            end++;
        }

        // Return the minimum window substring
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen + 1);

    }

}
