package test;

import main.IsAnagram;
import main.RangeExtraction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsAnagramTest {

    IsAnagram isAnagram;

    @Before
    public void setUp() {
        isAnagram = new IsAnagram();
    }

    @Test
    public void testIsAnagram() {
        /*
         * isAnagram.
         */
        System.out.println(isAnagram.isAnagram("ankara", "karana"));
    }
}
