package test.neet;
import main.neetCodeIO.LinkedList.LinkedlistCopyThatHasNextAndRandom;
import org.junit.Before;
import org.junit.Test;

public class LinkedlistCopyThatHasNextAndRandomTest {

    LinkedlistCopyThatHasNextAndRandom cpyLList;

    @Before
    public void setUp() {
        cpyLList = new LinkedlistCopyThatHasNextAndRandom();
    }

    @Test
    public void testCpyLList() {
        System.out.println(cpyLList.caller());
    }
}
