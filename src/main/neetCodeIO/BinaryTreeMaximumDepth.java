package main.neetCodeIO;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeMaximumDepth {
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
