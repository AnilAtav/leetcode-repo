package main.neetCodeIO.BinarySearchTree;

import main.neetCodeIO.TreeNode;

public class SortedArrayToBST {

    //Given an integer array nums where the elements are sorted in ascending order, convert it to a
    //height-balanced binary search tree.
    //Input: nums = [-10,-3,0,5,9]
    //Output: [0,-3,9,-10,null,5]

    public TreeNode sortedArrayToBST(int[] nums) {
        return generateTree(nums, 0, nums.length - 1);
    }

    public TreeNode generateTree(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = low + ((high - low) / 2);
        TreeNode node = new TreeNode(nums[mid]);

        node.left = generateTree(nums, low, mid - 1);
        node.right = generateTree(nums, mid + 1, high);

        return node;
    }
}
