package test.neet;

import main.neetCodeIO.IsPalindrome;
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
        String word = "A man, a plan, a canal: Panama";
        System.out.println("Is " + word + " palindrome? - " + isPalindrome.isPalindrome(word));

    }
}
