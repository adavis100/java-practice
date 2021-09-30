package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumPathSumTest {
    @Test
    void solvesExample() {
        // [-1,1,1,1,1,1,null]
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        MaximumPathSum2 maximumPathSum = new MaximumPathSum2();
        assertThat(maximumPathSum.maxPathSum(root)).isEqualTo(3);
    }
}