package test;

import main.FindPrimes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindPrimesTest {

    FindPrimes findPrime;

    @Before
    public void setUp() {
        findPrime = new FindPrimes();
    }

    @Test
    public void testFindPrime() {

        findPrime.find_prime(34);
    }
}
