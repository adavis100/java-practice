package com.javapractice.scratch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SecondLongestTest {
    @Test
    void returnsExpectedList() {
        SecondLongest secondLongest = new SecondLongest();
        assertThat(secondLongest.solution1(List.of("bill", "bob", "carl", "stu")))
                .containsExactly("bob", "stu");

        assertThat(secondLongest.solution2(List.of("bill", "bob", "carl", "stu","al", "b")))
                .containsExactly("bob", "stu");

        assertThat(secondLongest.solution3(List.of("bill", "bob", "carl", "stu","al", "b")))
                .containsExactly("bob", "stu");
    }
}