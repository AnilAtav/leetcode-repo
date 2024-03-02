package main;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {

    // takes an array of integers as input and returns a string representation of the ranges
    public String RangeExtractionFunc(int[] numbers) {
        List<String> ranges = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int startRange = numbers[i];

            // Find the end of the current range
            while (i + 1 < numbers.length && numbers[i + 1] - numbers[i] == 1) {
                i++;
            }

            int endRange = numbers[i];

            // Add the range to the list
            if (startRange == endRange) {
                ranges.add(Integer.toString(startRange));
            } else if (endRange - startRange == 1) {
                ranges.add(Integer.toString(startRange));
                ranges.add(Integer.toString(endRange));
            } else {
                ranges.add(startRange + "-" + endRange);
            }
        }
        return String.join(",", ranges);
    }
}
