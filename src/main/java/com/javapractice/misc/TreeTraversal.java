package com.javapractice.misc;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {
    static class Tree {
        int val;
        Tree left;
        Tree right;

        public Tree(int val, Tree left, Tree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int[] preorder(Tree root) {
        var list = new ArrayList<Integer>();
        preorderHelper(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void preorderHelper(Tree root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorderHelper(root.left, list);
        preorderHelper(root.right, list);
    }

    public int[] postorder(Tree root) {
        var list = new ArrayList<Integer>();
        postorderHelper(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    private void postorderHelper(Tree root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorderHelper(root.left, list);
        postorderHelper(root.right, list);
        list.add(root.val);
    }

    public int[] inorder(Tree root) {
        var list = new ArrayList<Integer>();
        inorderHelper(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorderHelper(Tree root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorderHelper(root.left, list);
        list.add(root.val);
        inorderHelper(root.right, list);
    }
}
