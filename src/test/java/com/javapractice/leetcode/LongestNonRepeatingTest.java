package com.javapractice.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
class LongestNonRepeatingTest {
    static Stream<Arguments> provideArgs() {
        return Stream.of(
                arguments("abcabcbb", 3),
                arguments("bbbbb", 1),
                arguments("pwwkew", 3),
                arguments("dvdf", 3),
                arguments("tmmzuxt", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgs")
    void returnsLengthOfLongestNonRepeatingSubstring(String s, int expected)  {
        LongestNonRepeating longestNonRepeating = new LongestNonRepeating();
        assertEquals(expected, longestNonRepeating.lengthOfLongestSubstring(s));
    }
}
