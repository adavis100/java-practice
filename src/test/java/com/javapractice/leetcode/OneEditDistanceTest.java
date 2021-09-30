package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OneEditDistanceTest {
    private OneEditDistance editDistance = new OneEditDistance();

    @Test
    void solvesTestCase() {
        assertThat(editDistance.isOneEditDistance("abcc", "accc")).isTrue();
    }
}