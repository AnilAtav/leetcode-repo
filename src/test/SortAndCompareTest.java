package test;

import main.SortAndCompare;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortAndCompareTest {

    SortAndCompare sortAndCompare;

    @Before
    public void setUp() {
        sortAndCompare = new SortAndCompare();
    }

    @Test
    public void testDoesFirst1IncludesOtherChars() {

        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("rkqodlw", "world"));
        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("cedewaraaossoqqyt", "codewars"));
        Assert.assertFalse(sortAndCompare.doesFirst1IncludesOtherChars("katas", "steak"));
        Assert.assertFalse(sortAndCompare.doesFirst1IncludesOtherChars("scriptjavx", "javascript"));
        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("scriptingjava", "javascript"));
        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("scriptsjava", "javascripts"));
        Assert.assertFalse(sortAndCompare.doesFirst1IncludesOtherChars("javscripts", "javascript"));
        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("aabbcamaomsccdd", "commas"));
        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("commas", "commas"));
        Assert.assertTrue(sortAndCompare.doesFirst1IncludesOtherChars("sammoc", "commas"));

    }
}
