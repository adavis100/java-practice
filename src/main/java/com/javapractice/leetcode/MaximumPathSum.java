package com.javapractice.leetcode;

public class MaximumPathSum {
    private int max;
    private static final int NONE = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max = root.val;
        maxPath(root);
        return max;
    }

    private int maxPath(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        } else {
            int maxLeft = root.left == null ? NONE : maxPath(root.left);
            int maxRight = root.right == null ? NONE : maxPath(root.right);

            int maxAtNode = findMaxOverall(maxLeft, maxRight, root.val);
            max = Math.max(max, maxAtNode);
            return findMax(maxLeft, maxRight, root.val);
        }
    }

    private int findMaxOverall(int l, int r, int root) {
        if (l == NONE) {
            return Math.max(r, Math.max(r + root, root));
        } else if (r == NONE) {
            return Math.max(l, Math.max(l + root, root));
        } else {
            return Math.max(l, Math.max(l + root, Math.max(r, Math.max(r + root, Math.max(l + r + root, root)))));
        }
    }

    private int findMax(int l, int r, int root) {
        if (l == NONE) {
            return Math.max(r + root, root);
        } else if (r == NONE) {
            return Math.max(l + root, root);
        } else {
            return Math.max(l + root, Math.max(r + root, Math.max(l + r + root, root)));
        }
    }
}
