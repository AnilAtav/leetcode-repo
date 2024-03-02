package main.neetCodeIO;

public class DSAMinWindowSubstring {

    //Input: s = "ADOBECODEBANC", t = "ABC"
    //Output: "BANC"
    //Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

    public String minWindow(String s, String t) {
        int[] charMapT = new int[128];

        for (char c : t.toCharArray()) {
            charMapT[c]++;
        }

        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0, requiredChars = t.length();

        while (end < s.length()) {
            char currChar = s.charAt(end);

            if (charMapT[currChar] > 0) {
                requiredChars--;
            }

            charMapT[currChar]--;

            while (requiredChars == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                charMapT[startChar]++;

                if (charMapT[startChar] > 0) {
                    requiredChars++;
                }

                start++;
            }

            end++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen + 1);
    }

}
