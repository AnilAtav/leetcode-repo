package main.neetCodeIO.BinarySearchTree;

import main.neetCodeIO.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTreeValidate {
    // in-order traversal technic recursive - for iterative check Kth element class | https://www.youtube.com/watch?v=sLoZJ2E4ZDs

    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList = new LinkedList<>();
        helper(root, inOrderList);
        boolean isBST = true;
        int pre = inOrderList.get(0);
        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= pre)
                isBST = false;
            pre = inOrderList.get(i);
        }
        return isBST;
    }

    void helper(TreeNode node, List<Integer> inOrderList) {
        if (node == null)
            return;
        helper(node.left, inOrderList);
        inOrderList.add(node.val);
        helper(node.right, inOrderList);
    }
}
