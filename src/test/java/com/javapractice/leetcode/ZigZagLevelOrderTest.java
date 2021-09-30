package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ZigZagLevelOrderTest {
    /**
     * Input: root = [3,9,20,null,null,15,7]
     * Output: [[3],[20,9],[15,7]]
     */
    @Test
    void solvesTestCase() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> traversal = new ZigZagLevelOrder().zigzagLevelOrder(root);
        assertThat(traversal.size()).isEqualTo(3);
        assertThat(traversal.get(0)).containsExactly(3);
        assertThat(traversal.get(1)).containsExactly(20, 9);
        assertThat(traversal.get(2)).containsExactly(15, 7);
    }
}