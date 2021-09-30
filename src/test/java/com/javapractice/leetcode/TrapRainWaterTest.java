package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrapRainWaterTest {
    @Test
    void solvesTestCase() {
        TrapRainWater trapRainWater = new TrapRainWater();
        assertThat(trapRainWater.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1})).isEqualTo(6);
    }
}