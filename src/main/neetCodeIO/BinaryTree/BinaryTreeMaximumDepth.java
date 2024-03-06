package main.neetCodeIO.BinaryTree;

import main.neetCodeIO.TreeNode;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTreeMaximumDepth {
    //Given the root of a binary tree, return its maximum depth.
    //A binary tree's maximum depth is the number of nodes along the longest path from the root node
    // down to the farthest leaf node.
    //Input: root = [3,9,20,null,null,15,7]
    //Output: 3

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            depth++;
        }

        return depth;
    }

    public int maxDepthRecursive(TreeNode root) {
        if(root == null){ return 0;}

        return 1 + Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right));
    }
}
