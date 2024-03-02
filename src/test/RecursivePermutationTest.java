package test;

import main.RecursivePermutation;
import org.junit.Before;
import org.junit.Test;

public class RecursivePermutationTest {
    RecursivePermutation recursivePermutation;

    @Before
    public void setUp() {
        recursivePermutation = new RecursivePermutation();
    }

    @Test
    public void testRangeExtraction() {

        //recursive permutation
        String str = "ABC";
        int n = str.length();
        recursivePermutation.permute(str, 0, n - 1);
    }
}
