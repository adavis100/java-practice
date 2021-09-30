package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WildcardMatchTest {
    @Test
    void matchesTestCases() {
        WildcardMatch match = new WildcardMatch();

//        assertThat(match.isMatch("", "")).isTrue();
//        assertThat(match.isMatch("", "*")).isTrue();
//        assertThat(match.isMatch("foo", "*")).isTrue();
//        assertThat(match.isMatch("a", "?")).isTrue();
//        assertThat(match.isMatch("a", "a")).isTrue();
//        assertThat(match.isMatch("b", "a")).isFalse();
//        assertThat(match.isMatch("aa", "a")).isFalse();
//        assertThat(match.isMatch("aa", "")).isFalse();
//        assertThat(match.isMatch("aa", "*a")).isTrue();
//        assertThat(match.isMatch("aa", "?a")).isTrue();
//        assertThat(match.isMatch("adceb", "*a*b")).isTrue();
//        assertThat(match.isMatch("adceb", "*a*bb")).isFalse();
        assertThat(match.isMatch("abcabczzzde", "*abc???de*")).isTrue();
        assertThat(match.isMatch("abcdefa", "a*a")).isTrue();
        assertThat(match.isMatch("bbaabbbabbbbabbbaaabababbbabbababbbabaaabbbbaabaabaaaa", "*b**b*a**abbaab*aba***")).isFalse();

    }
}