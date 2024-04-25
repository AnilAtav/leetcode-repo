package test.TopInterviewTests.ArraysNHashing;

import main.neetCodeIO.ArraysNHashing.RomanToInt;
import org.junit.Before;
import org.junit.Test;


public class RomanToIntTest {

    RomanToInt testObj;

    @Before
    public void setUp() {
        testObj = new RomanToInt();
    }

    @Test
    public void aaTest() {


        // Test cases
        String[] romanNumerals = {"III", "IV", "IX", "LVIII", "MCMXCIV"};

        // Iterate through the test cases
        for (String romanNumeral : romanNumerals) {
            int result = testObj.romanToInt(romanNumeral);
            System.out.println("Roman numeral: " + romanNumeral + ", Integer value: " + result);
        }
    }

}
