package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveCommentsTest {
    @Test
    void solvesTestCase() {
        RemoveComments removeComments = new RemoveComments();

        List<String> lines = removeComments.removeComments(new String[] {"  /*/ declare members;*/"});
        assertThat(lines).containsExactly("  ");
    }
}