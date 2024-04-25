package test.TopInterviewTests.SlidingWindow;

import main.neetCodeIO.SlidingWindow.MinWindowSubstring;
import org.junit.Before;
import org.junit.Test;

public class MinWindowSubstringTest {

    MinWindowSubstring testObj;

    @Before
    public void setUp() {
        testObj = new MinWindowSubstring();
    }

    @Test
    public void aaTest() {

        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = testObj.minWindow(s, t);
        System.out.println("Result: " + result);
    }
}
