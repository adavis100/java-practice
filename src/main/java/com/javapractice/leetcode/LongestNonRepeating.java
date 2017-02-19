package com.javapractice.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestNonRepeating {
    int lengthOfLongestSubstring(String s) {
        Set<Character> found = new HashSet<>();

        int start = 0, end = 0, longestSoFar = 0, longestOverall = 0;
        while (end < s.length()) {
            for (; end < s.length() && !found.contains(s.charAt(end)); end++) {
                longestSoFar++;
                found.add(s.charAt(end));
            }
            if (end < s.length()) {
                found.remove(s.charAt(end));
                while (s.charAt(start) != s.charAt(end)) {
                    found.remove(s.charAt(start));
                    start++;
                }
                start++;
                if (longestSoFar > longestOverall) {
                    longestOverall = longestSoFar;
                }
                longestSoFar = end - start;
            }
        }
        if (longestSoFar > longestOverall) {
            longestOverall = longestSoFar;
        }
        return longestOverall;
    }
}
