package com.javapractice.codewars;

class Beggars {
    public static int[] beggars(int[] values, int n) {
        int[] earnings = new int[n];
        int curBeggar = 0;
        if (n == 0) {
            return earnings;
        }
        for (int value : values) {
            earnings[curBeggar] += value;
            curBeggar = (n == 1) ? 0 : (curBeggar + 1) % n;
        }
        return earnings;
    }
}
