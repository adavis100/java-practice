package com.javapractice.leetcode;

import com.javapractice.leetcode.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsTest {
    @Test
    void reversesWords() {
        ReverseWords reverse = new ReverseWords();
        assertThat(reverse.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
        assertThat(reverse.reverseWords("   the sky   is blue   ")).isEqualTo("blue is sky the");
    }

    @Test
    void reversesWordsCharArray() {
        ReverseWords reverse = new ReverseWords();
        char[] words = "the sky is blue".toCharArray();
        reverse.reverseWords(words);
        assertThat(new String(words)).isEqualTo("blue is sky the");
    }
}