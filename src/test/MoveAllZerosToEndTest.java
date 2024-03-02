package test;

import main.ZeroShifting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveAllZerosToEndTest {

    ZeroShifting zeroShifting;

    @Before
    public void setUp() {
        zeroShifting = new ZeroShifting();
    }

    @Test
    public void testMoveAllZerosToEnd() {
        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int[] expectedArray = {1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0};

        Assert.assertArrayEquals(expectedArray, zeroShifting.moveAllZerosToEnd(array));
    }
}
