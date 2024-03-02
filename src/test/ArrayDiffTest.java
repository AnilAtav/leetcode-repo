package test;

import main.ArrayDiff;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrayDiffTest {
    ArrayDiff arrayDiff;

    @Before
    public void setUp() {
        arrayDiff = new ArrayDiff();
    }

    @Test
    public void testArrayDiff() {

        //remove elements from given array - vanilla
        System.out.println(Arrays.toString(arrayDiff.arrayDiff(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2})));
    }
}
