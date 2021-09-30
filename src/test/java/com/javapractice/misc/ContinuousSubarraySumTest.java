package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContinuousSubarraySumTest {
    private final ContinuousSubarraySum sum = new ContinuousSubarraySum();

    @Test
    void solvesTestCase() {
        assertThat(sum.continuousSubarrays(new int[] {1, 2, 1, 1}, 2)).isEqualTo(2);
    }

    @Test
    void handlesFirstElementSummingToValue() {
        assertThat(sum.continuousSubarrays(new int[] {1, 2, 1, 1}, 1)).isEqualTo(3);
    }

    @Test
    void handlesLongerTestCase() {
        assertThat(sum.continuousSubarrays(new int[] {1,11,5,3,2,3,2,1}, 16)).isEqualTo(2);
    }
}