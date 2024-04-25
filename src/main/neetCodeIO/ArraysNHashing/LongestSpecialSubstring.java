package main.neetCodeIO.ArraysNHashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSpecialSubstring {
    // we're finding the maximum length of repeated substrings that occur at least 3 times in the given string
    //Input: s = "aaaa"
    //Output: 2
    //Explanation: The longest special substring which occurs thrice is "aa": substrings "aaaa", "aaaa", and "aaaa".
    //It can be shown that the maximum length achievable is 2.
    //Input: s = "abcaba"
    //Output: 1
    //Explanation: The longest special substring which occurs thrice is "a": substrings "abcaba", "abcaba", and
    // "abcaba".

    public int maximumLength(String s) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) break;
                // If characters are the same, create a substring from index i to j+1 and update its frequency
                String temp = s.substring(i, j + 1);
                map.put(temp, map.getOrDefault(temp, 0) + 1);

                //aa->3
                //aaa->2
                //a->4
                //aaaa->1
            }
        }
        int len = -1;
        for (String key : map.keySet()) {
            // If the length of the substring is greater than the current max length
            // and its frequency is at least 3, update the max length
            if (key.length() > len && map.get(key) >= 3) {
                len = key.length();
            }
        }

        return len;
    }
}
