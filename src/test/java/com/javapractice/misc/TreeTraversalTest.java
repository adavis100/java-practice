package com.javapractice.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.javapractice.misc.TreeTraversal.Tree;

class TreeTraversalTest {
    Tree tree = new Tree(1, new Tree(2, new Tree(4, null, null), null), new Tree(3, new Tree(5, null, null), new Tree(6, null, null)));
    private TreeTraversal traversal;

    @BeforeEach
    void setUp() {
        traversal = new TreeTraversal();
    }

    @Test
    void doesPreorder() {
        assertThat(traversal.preorder(tree)).containsExactly(1, 2, 4, 3, 5, 6);
    }

    @Test
    void doesPostorder() {
        assertThat(traversal.postorder(tree)).containsExactly(4, 2, 5, 6, 3, 1);
    }

    @Test
    void doesInorder() {
        assertThat(traversal.inorder(tree)).containsExactly(4, 2, 1, 5, 3, 6);
    }
}