package main.neetCodeIO;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInvert {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return root;
    }

    public TreeNode invertTreeRecursive(TreeNode root) {
        if (root == null) return null;

        TreeNode left = invertTreeRecursive(root.left);
        TreeNode right = invertTreeRecursive(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
