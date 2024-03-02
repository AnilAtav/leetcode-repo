package main.neetCodeIO;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSameTree {
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
