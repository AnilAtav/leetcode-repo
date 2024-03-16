package main.neetCodeIO.Sorting;

import java.util.PriorityQueue;

public class SortMinHeap {

    // return the kth largest element in the array.
    // Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
    // After iterating through all elements, the heap contains the k largest
    // elements, and the root of the heap is the kth largest element.
    public int findKthLargest(int[] nums, int k) {
        //create a min heap
        PriorityQueue<Integer> heap = new PriorityQueue();

        //iterate over the array
        for (int n : nums) {
            //first add the integer to heap
            heap.add(n);
            //if size of the heap is greater than k
            if (heap.size() > k) {
                //remove the root element (lowest of all)
                heap.poll();
            }
        }
        //finally heap has k largest elements left with root as the kth largest element
        return heap.peek();
    }
}
