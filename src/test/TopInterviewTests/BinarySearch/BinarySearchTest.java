package test.TopInterviewTests.BinarySearch;

import main.neetCodeIO.BinarySearch.BinarySearch;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    BinarySearch testObj;

    @Before
    public void setUp() {
        testObj = new BinarySearch();
    }

    @Test
    public void aaTest() {
        // SearchInsert
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = testObj.searchInsert(nums1, target1);
        System.out.println("SearchInsert Result: " + result1);

        // FindMin
        int[] nums2 = {3, 4, 5, 1, 2};
        int result2 = testObj.findMin(nums2);
        System.out.println("FindMin Result: " + result2);

        // Search
        int[] nums3 = {4, 5, 6, 7, 0, 1, 2};
        int target3 = 0;
        int result3 = testObj.search(nums3, target3);
        System.out.println("Search Result: " + result3);
    }
}
