package com.javapractice.codewars;

public class InAscendingOrder {
    public static boolean isAscOrder(int[] arr) {
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < prev) {
                return false;
            }
            prev = arr[i];
        }
        return true;
    }
}
