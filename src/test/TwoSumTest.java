package test;

import main.TwoSum;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSum() {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("listedeki hangi iki sayinin toplami targettir: " + twoSum.twoSum(nums, 8));
    }
}
