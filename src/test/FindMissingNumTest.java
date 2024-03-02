package test;

import main.FindMissingNum;
import org.junit.Before;
import org.junit.Test;

public class FindMissingNumTest {

    FindMissingNum findMissingNum;

    @Before
    public void setUp(){
        findMissingNum = new FindMissingNum();
    }

    @Test
    public void testFindMissingNum(){
        /*
         * find missing number in an consecutive int array
         */
        int[] array = {4, 3, 8, 1, 5, 2, 6};
        int missingNumber = findMissingNum.findMissingNum(array);
        System.out.println("Missing Number is " + missingNumber);
    }
}
