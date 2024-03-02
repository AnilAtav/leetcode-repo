package main.neetCodeIO;

import java.util.Stack;

public class BinarySearchTreeIterator {
    // in-order traversal technic | https://www.youtube.com/watch?v=D2jMcmxU4bs

    Stack<TreeNode> stack = new Stack<>();

    public void BSTIterator(TreeNode root) {
        PartialInorder(root);
    }

    public int next() {
        TreeNode top = stack.pop();
        PartialInorder(top.right);
        return top.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    void PartialInorder(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
