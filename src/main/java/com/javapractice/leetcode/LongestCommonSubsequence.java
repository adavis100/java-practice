package com.javapractice.leetcode;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] memo = new int[text1.length() + 1][text2.length() + 1];
        fillWithNegativeOne(memo, text1.length(), text2.length());
        return lcsMemo(text1, text2, 0, 0, memo);
    }

    private void fillWithNegativeOne(int[][] memo, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
    }

    private int lcsMemo(String text1, String text2, int cur1, int cur2, int[][] memo) {
        int m = text1.length();
        int n = text2.length();

        if (memo[cur1][cur2] != -1) {
            return memo[cur1][cur2];
        }

        if (text1.charAt(cur1) == text2.charAt(cur2)) {
            memo[cur1][cur2] = 1 + lcsMemo(text1, text2, cur1 + 1, cur2 + 1, memo);
        } else {
            memo[cur1][cur2] = Math.max(lcsMemo(text1, text2, cur1 + 1, cur2, memo), lcsMemo(text1, text2, cur1, cur2 + 1, memo));
        }
        return memo[cur1][cur2];
    }

    public int longestCommonSubsequenceDp(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        dp[0][0] = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[m][n];
    }

    public int longestCommonSubstring(String str1, String str2) {
        int[][] lens = new int[str1.length() + 1][str2.length() + 1];
        int max = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    max = Math.max(max, lens[i][j] + 1);
                    lens[i + 1][j + 1] = lens[i][j] + 1;
                } else {
                    lens[i + 1][j + 1] = 0;
                }
            }
        }
        return max;
    }
}
