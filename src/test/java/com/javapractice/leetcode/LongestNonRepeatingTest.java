package com.javapractice.leetcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestNonRepeatingTest {
    @DataProvider
    public static Object[][] provideArgs() {
        return new Object[][]{
                new Object[]{"abcabcbb", 3},
                new Object[]{"bbbbb", 1},
                new Object[]{"pwwkew", 3},
                new Object[]{"dvdf", 3},
                new Object[]{"tmmzuxt", 5}
        };
    }

    @Test (dataProvider = "provideArgs")
    public void returnsLengthOfLongestNonRepeatingSubstring(String s, int expected) throws Exception {
        LongestNonRepeating longestNonRepeating = new LongestNonRepeating();
        assertEquals(longestNonRepeating.lengthOfLongestSubstring(s), expected);
    }
}
