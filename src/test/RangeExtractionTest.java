package test;

import main.RangeExtraction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RangeExtractionTest {

    RangeExtraction rangeExtraction;

    @Before
    public void setUp() {
        rangeExtraction = new RangeExtraction();
    }

    @Test
    public void testRangeExtraction() {
        int[] numbers = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String expectedNumbers = "-10--8,-6,-3-1,3-5,7-11,14,15,17-20";

        Assert.assertEquals(expectedNumbers, rangeExtraction.RangeExtractionFunc(numbers));
    }
}
