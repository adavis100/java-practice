package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import static com.javapractice.misc.Bst.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class BstTest {
    @Test
    void buildsTreeFromArray() {
        TreeNode root = Bst.fromArray(new int[] {1, 2, 3, 4, 5});

        assertThat(root.val).isEqualTo(3);
        assertThat(root.left.val).isEqualTo(2);
        assertThat(root.left.left.val).isEqualTo(1);
        assertThat(root.right.val).isEqualTo(5);
        assertThat(root.right.left.val).isEqualTo(4);
    }
}