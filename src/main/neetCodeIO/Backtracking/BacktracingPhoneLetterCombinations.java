package main.neetCodeIO.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktracingPhoneLetterCombinations {

    //Input: digits = "23"
    //Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    private static final String[] keypad = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (!digits.isEmpty()) {
            generateCombinations(digits, "", results);
        }
        return results;
    }

    static void generateCombinations(String s, String ans, List<String> result) {
        if (s.length() == 0) {
            result.add(ans);
            return;
        }
        String key = keypad[s.charAt(0) - '0'];
        for (int i = 0; i < key.length(); i++) {
            generateCombinations(s.substring(1), ans + key.charAt(i), result);
        }
    }
}
