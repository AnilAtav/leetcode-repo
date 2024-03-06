package main.neetCodeIO.BinaryTree;

import main.neetCodeIO.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BinaryTreeDiameterPostOrderTraversal {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root != null)
            stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node = stack.peek();

            if (node.left !=null && !map.containsKey(node.left))
                stack.push(node.left);
            else if (node.right !=null && !map.containsKey(node.right))
                stack.push(node.right);
            else {
                //process the root, once left and right subtree processed
                stack.pop();
                int leftDepth = map.getOrDefault(node.left,0);
                int rightDepth = map.getOrDefault(node.right,0);
                //put the max depth at a node to map
                map.put(node,1+Math.max(leftDepth,rightDepth));
                //update the max depth found so far
                diameter=Math.max(diameter,leftDepth+rightDepth);
            }
        }
        return diameter;
    }

    //recursive
    int max = -1;
    public int diameterOfBinaryTreeRecursive(TreeNode root) {
        height(root);
        return max;
    }

    private int height(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        max = Math.max(max, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
