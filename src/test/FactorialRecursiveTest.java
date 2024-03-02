package test;

import main.FactorialRecursive;
import org.junit.Before;
import org.junit.Test;

public class FactorialRecursiveTest {

    FactorialRecursive factorialRecursive;

    @Before
    public void setUp() {
        factorialRecursive = new FactorialRecursive();
    }

    @Test
    public void testFactorialRecursive() {
        /*
         * returns the factorial of the given num recursively
         */
        System.out.println(factorialRecursive.factorialRecursive(3));
    }
    @Test
    public void testFiboRecursive() {
        /*
         * fibo recursion.
         */
        System.out.println(factorialRecursive.fiboRecursive(7));
    }
}
