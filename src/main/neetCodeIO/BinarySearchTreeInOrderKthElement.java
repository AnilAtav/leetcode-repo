package main.neetCodeIO;

import java.util.Stack;

public class BinarySearchTreeInOrderKthElement {

    // https://www.youtube.com/watch?v=5LUXSvjmGCw&t=4s

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int n = 0;

        while (stack != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            n++;
            if (n == k)
                return node.val;
            node = node.right;
        }
        return -1;
    }
}
