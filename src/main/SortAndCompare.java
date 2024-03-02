package main;

public class SortAndCompare {

    //compares 2 strngs and checks if 1st one includes others characters
    public boolean doesFirst1IncludesOtherChars(String str1, String str2)
    {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq2[str2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] < freq2[i]) {
                return false;
            }
        }
        return true;
    }

}
