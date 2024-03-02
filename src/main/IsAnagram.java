package main;

import java.util.Arrays;

public class IsAnagram {

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        return Arrays.equals(ca1, ca2);
    }
}
