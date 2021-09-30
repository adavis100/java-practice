package com.javapractice.misc;

import java.util.ArrayDeque;
import java.util.List;

public class Bst {
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode fromArray(int[] array) {
        return buildTree(array, 0, array.length);
    }

    private static TreeNode buildTree(int[] array, int start, int end) {
        if (start >= end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        return new TreeNode(array[mid], buildTree(array, start, mid), buildTree(array, mid + 1, end));
    }

    public static List<Integer> subTree(TreeNode root, int from, int to) {
        if (root == null) {
            return List.of();
        }

        TreeNode cur = root;
        var stack = new ArrayDeque<TreeNode>();
        while (true) {
            if (cur.val > from) {
                stack.push(cur);
                if (cur.left != null) {
                    cur = cur.left;
                }
            } else if (cur.val < from) {
                stack.push(cur);
                cur = cur.right;
            }
        }
    }
}
