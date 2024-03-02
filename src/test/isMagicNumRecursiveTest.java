package test;

import main.IsMagicNumRecursive;
import org.junit.Before;
import org.junit.Test;

public class isMagicNumRecursiveTest {

    IsMagicNumRecursive isMagicNumRecursive;

    @Before
    public void setUp() {
        isMagicNumRecursive = new IsMagicNumRecursive();
    }

    @Test
    public void testIsMagicNumRecursive() {
//        find magic number Step1: 63 => 1+6+3 = 10 Step 2: 10 => 1+0 = 1 => Hence 163 is a magic number
        System.out.println(isMagicNumRecursive.isMagicNumRecursive(163));
    }
}
