package com.javapractice.scratch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationsTest {
    private Permutations permutations = new Permutations();
    @Test
    void getsPermutationsOfLengthOneString() {
        assertThat(permutations.stringPermutations("a")).containsExactly("a");
    }

    @Test
    void getsPermutationsOfLengthTwoString() {
        assertThat(permutations.stringPermutations("ab")).contains("ab", "ba");
    }

    @Test
    void getsPermutationsOfLengthThreeString() {
        assertThat(permutations.stringPermutations("abc")).contains("abc", "acb", "bac", "bca", "cab", "cba");
    }
}