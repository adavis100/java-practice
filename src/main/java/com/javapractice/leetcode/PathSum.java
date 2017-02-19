package com.javapractice.leetcode;


import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        pathSumHelper(root, path, root.val, sum, list);
        return list;
    }

    private void pathSumHelper(TreeNode node, List<Integer> path, int currentSum, int sum, List<List<Integer>> list) {
        if (node.right == null && node.left == null && currentSum == sum) {
            list.add(new ArrayList<>(path));
            return;
        }
        if (node.left != null) {
            path.add(node.left.val);
            pathSumHelper(node.left, path, currentSum + node.left.val, sum, list);
            path.remove(path.lastIndexOf(node.left.val));
        }
        if (node.right != null) {
            path.add(node.right.val);
            pathSumHelper(node.right, path, currentSum + node.right.val, sum, list);
            path.remove(path.lastIndexOf(node.right.val));
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
