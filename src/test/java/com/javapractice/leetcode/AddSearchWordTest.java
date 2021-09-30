package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddSearchWordTest {
    @Test
    void solvesExample() {
        AddSearchWord addSearchWord = new AddSearchWord();
        addSearchWord.addWord("bad");
        addSearchWord.addWord("dad");
        addSearchWord.addWord("mad");
        assertThat(addSearchWord.search("pad")).isFalse();
        assertThat(addSearchWord.search("bad")).isTrue();
        assertThat(addSearchWord.search(".ad")).isTrue();
        assertThat(addSearchWord.search("b..")).isTrue();
    }
}