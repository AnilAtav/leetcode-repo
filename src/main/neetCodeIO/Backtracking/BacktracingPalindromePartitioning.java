package main.neetCodeIO.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktracingPalindromePartitioning {

    //Given a string s, partition s such that every substring of the partition is a palindrome.
    //Return all possible palindrome partitioning of s.
    //Input: s = "aab"
    //Output: [["a","a","b"],["aa","b"]]
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, List<String> current, String s, int start) {
        if (start == s.length()) {
            // If we have reached the end of the string, add the current partition to the result.
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                // If the current substring is a palindrome, add it to the current partition.
                current.add(substring);
                // Recursively explore the rest of the string.
                backtrack(result, current, s, end);
                // Backtrack by removing the last added substring.
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
