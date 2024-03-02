package test;

import main.SameCharCounter;
import org.junit.Before;
import org.junit.Test;

public class SameCharCounterTest {

    SameCharCounter sameCharCounter;

    @Before
    public void setUp(){
        sameCharCounter = new SameCharCounter();
    }

    @Test
    public void testSameCharCounter(){

        System.out.println(sameCharCounter.StrCount("aabbbac"));

    }
}
