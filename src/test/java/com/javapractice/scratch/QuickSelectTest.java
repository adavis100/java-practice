package com.javapractice.scratch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSelectTest {

    @Test
    void findsKthLargest() {
        QuickSelect quickSelect = new QuickSelect();
        assertThat(quickSelect.findKthLargest(new int[] {7, 4, 3, 2, 1, 5, 6}, 2)).isEqualTo(6);
        assertThat(quickSelect.findKthLargest(new int[] {3,2,1}, 1)).isEqualTo(3);
    }
}