package com.javapractice.leetcode;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] s = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && s[i - coin] >= 0) {
                    int count = 1 + s[i - coin];
                    if (count < min)
                        min = count;
                }
            }
            if (min < Integer.MAX_VALUE)
                s[i] = min;
            else
                s[i] = -1;
        }
        return s[amount];
    }
}
