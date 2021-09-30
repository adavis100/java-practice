package com.javapractice.leetcode;

public class MaximumPathSum2 {
    private int max;

    public int maxPathSum(TreeNode root) {
        max = 0;
        maxPathHelper(root);
        return max;
    }

    private int maxPathHelper(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            max = Math.max(max, root.val);
            return root.val;
        } else {
            int leftMax = maxPathHelper(root.left);
            int rightMax = maxPathHelper(root.right);
            max = Math.max(max, leftMax + rightMax + root.val);
            return Math.max(leftMax, rightMax) + root.val;
        }
    }
}
