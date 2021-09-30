package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClosestKTest {
    @Test
    void findClosestTargetBeforeFirst() {
        ClosestK closestK = new ClosestK();
        assertThat(closestK.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1)).containsExactly(1, 2, 3, 4);
    }

    @Test
    void findClosestTargetAfterLast() {
        ClosestK closestK = new ClosestK();
        assertThat(closestK.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 6)).containsExactly(2, 3, 4, 5);
    }

    @Test
    void findsClosestFromMiddle() {
        ClosestK closestK = new ClosestK();
        assertThat(closestK.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3)).containsExactly(1, 2, 3, 4);
    }

    @Test
    void solvesAnotherTestCase() {
        ClosestK closestK = new ClosestK();
        assertThat(closestK.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1)).containsExactly(1, 2, 3, 4);

    }
}