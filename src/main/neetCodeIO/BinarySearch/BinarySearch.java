package main.neetCodeIO.BinarySearch;

public class BinarySearch {

    //init
    //Input: nums = [1,3,5,6], target = 5
    //Output: 2
    public int searchInsert(int[] nums, int target) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (low <= high) {

            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    //Find Minimum in Rotated Sorted Array
    //Input: nums = [3,4,5,1,2]
    //Output: 1
    public int findMin(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1, result = nums[0];
        while (low <= high) {
            //If search space is already sorted then always nums[low] will be smaller in that search space
            if (nums[low] < nums[high]) {
                result = Math.min(result, nums[low]);
                break;
            }
            mid = low + (high - low) / 2;
            result = Math.min(result, nums[mid]);

            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    //Search in Rotated Sorted Array
    //Input: nums = [4,5,6,7,0,1,2], target = 0  [6,7,0,1,2,4,5]
    //Output: 4
    public int search(int[] nums, int target) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                // Left half is sorted
                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
