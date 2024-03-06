package main.neetCodeIO.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import main.neetCodeIO.TreeNode;

public class BinaryTreeInorderTraversal {

    //Given the root of a binary tree, return the inorder traversal of its nodes' values.
    //Input: root = [1,null,2,3]
    //Output: [1,3,2]
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null) {
            if(node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                res.add(node.val);
                node = node.right;
            }
        }

        return res;
    }
}
