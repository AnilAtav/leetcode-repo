package main.neetCodeIO.Sorting;

public class SortQuickSort {

    // select a pivot element from the array and partitioning the other elements into two sub-arrays
    // according to whether they are less than or greater than the pivot
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];
        quickSort(0, nums.length - 1, nums);
        return nums;
    }

    private void quickSort(int start, int end, int[] nums) {
        if (start >= end) return;

        int left = start, right = end;
        int pivot = nums[(left + right) / 2];

        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(start, right, nums);
        quickSort(left, end, nums);
    }
}
