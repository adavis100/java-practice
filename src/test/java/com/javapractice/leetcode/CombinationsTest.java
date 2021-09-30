package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationsTest {
    @Test
    void findsCombinations() {
        Combinations combinations = new Combinations();

        assertThat(combinations.combinationSum3(3, 7)).hasSize(1);
        assertThat(combinations.combinationSum3(3, 7).get(0)).isEqualTo(List.of(1, 2, 4));
    }
}
