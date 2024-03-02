package main;

public class IsPalindrome {

    public boolean isPalindromeRecursive(String s, int i, int j) {
        if (s.charAt(i) != s.charAt(j))
            return false;
        if (j <= i)
            return true;
        return isPalindromeRecursive(s, i + 1, j - 1);
    }

    public boolean isWordPalindrome(String word) {
        String reverseWord = getReverseWord(word, "", word.length() - 1);
        //if word equals its reverse, then it is a palindrome
        return word.equals(reverseWord);
    }

    public String getReverseWord(String word, String reverse, int index) {
        if (index < 0) {
            return reverse;
        }
        return getReverseWord(word, reverse + word.charAt(index), index - 1);
    }
}
