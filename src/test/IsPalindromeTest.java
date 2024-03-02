package test;

import main.IsPalindrome;
import main.RangeExtraction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsPalindromeTest {

    IsPalindrome isPalindrome;

    @Before
    public void setUp() {
        isPalindrome = new IsPalindrome();
    }

    @Test
    public void testIsPalindrome() {
        String word = "kelek";
        System.out.println("Is " + word + " palindrome? - " + isPalindrome.isWordPalindrome(word));
        //recursive palindrome
        System.out.println("Is " + word + " isPalindrome? - " + isPalindrome.isPalindromeRecursive(word,0,word.length()-1));

    }
}
