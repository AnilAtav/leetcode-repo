package test.TopInterviewTests.ArraysNHashing;

import main.neetCodeIO.ArraysNHashing.LongestSpecialSubstring;
import org.junit.Before;
import org.junit.Test;

public class LongestSpecialSubstringTest {

    LongestSpecialSubstring testObj;

    @Before
    public void setUp() {
        testObj = new LongestSpecialSubstring();
    }

    @Test
    public void aaTest() {
//        String s = "abcbcbcdefg";
        String s = "aaaa";
        System.out.println("Maximum Length: " + testObj.maximumLength(s)); // Output: 3
    }

}
