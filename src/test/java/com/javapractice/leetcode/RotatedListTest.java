package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotatedListTest {
    @Test
    void findsTarget() {
        assertThat(new RotatedList().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
        assertThat(new RotatedList().search(new int[] {3, 1}, 3)).isEqualTo(0);
        assertThat(new RotatedList().search(new int[] {3, 1}, 1)).isEqualTo(1);
        assertThat(new RotatedList().search(new int[] {1, 3}, 1)).isEqualTo(0);
    }

    @Test
    void findsPivot() {
        assertThat(new RotatedList().findPivot(new int[] {3, 1}, 0, 2)).isEqualTo(1);
        assertThat(new RotatedList().findPivot(new int[] {4, 5, 6, 7, 0, 1, 2}, 0, 7)).isEqualTo(4);
        assertThat(new RotatedList().findPivot(new int[] {7, 0, 1}, 0, 3)).isEqualTo(1);
    }
}