package test;

import main.neetCodeIO.ArraysNHashing.RomanToInt;
import org.junit.Test;


public class aaTest {

    @Test
    public void aaTest() {

        RomanToInt solution = new RomanToInt();

        // Test cases
        String[] romanNumerals = {"III", "IV", "IX", "LVIII", "MCMXCIV"};

        // Iterate through the test cases
        for (String romanNumeral : romanNumerals) {
            int result = solution.romanToInt(romanNumeral);
            System.out.println("Roman numeral: " + romanNumeral + ", Integer value: " + result);
        }
    }

}
