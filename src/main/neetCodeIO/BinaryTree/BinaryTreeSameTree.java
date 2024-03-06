package main.neetCodeIO.BinaryTree;

import main.neetCodeIO.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSameTree {
    //https://leetcode.com/problems/same-tree/description/?envType=study-plan-v2&envId=top-interview-150
    //Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    //Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()){
            TreeNode ltree = queue.poll();
            TreeNode rtree = queue.poll();

            if (ltree == null && rtree == null) continue;
            else if (ltree == null || rtree == null || ltree.val != rtree.val){
                return false;
            }

            queue.add(ltree.left);
            queue.add(rtree.left);
            queue.add(ltree.right);
            queue.add(rtree.right);
        }
        return  true;
    }
}
