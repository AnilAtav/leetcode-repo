package main.neetCodeIO.BinaryTree;

import com.sun.source.tree.Tree;
import main.neetCodeIO.TreeNode;

import java.util.Stack;

public class PathSumLevelOrderTraversal {

    //level order traversal
    //Given the root of a binary tree and an integer targetSum, return true if the tree has a
    // root-to-leaf path such that adding up all the values along the path equals targetSum.
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null)
            return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sumPath = new Stack<>();
        path.push(root);
        sumPath.push(root.val);

        while (!path.isEmpty()){
            TreeNode temp = path.pop();
            int tmpInt = sumPath.pop();

            if (temp.left == null && temp.right == null && tmpInt == targetSum)
                return true;

            if (temp.right != null){
                path.push(temp.right);
                sumPath.push(temp.right.val + tmpInt);
            }
            if (temp.left != null){
                path.push(temp.left);
                sumPath.push(temp.left.val + tmpInt);
            }
        }
        return false;
    }

    //recursive solution
    public boolean hasPathSumRecursive(TreeNode root, int targetSum) {
        if (root == null) return false;

        targetSum -= root.val;

        if (targetSum == 0 && root.left == null && root.right == null) return true;

        return hasPathSumRecursive(root.left, targetSum) || hasPathSumRecursive(root.right, targetSum);
    }
}
