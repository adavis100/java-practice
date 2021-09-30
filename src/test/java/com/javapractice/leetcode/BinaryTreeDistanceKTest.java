package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeDistanceKTest {
    // root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
    //O utput: [7,4,1]
    @Test
    void solvesExampleTestCode() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode target = root.left;

        List<Integer> list = new BinaryTreeDistanceK().distanceK(root, target, 2);
        assertThat(list).containsExactlyInAnyOrder(7, 4, 1);
    }
}