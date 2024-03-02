package main;

import java.util.HashMap;
import java.util.Map;

public class SameCharCounter {

    public Map<Character, Integer> StrCount(String str) {

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            } else {
                charCount.put(str.charAt(i), 1);
            }
        }
        return charCount;

    }
}
