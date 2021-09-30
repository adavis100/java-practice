package com.javapractice.misc;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Scratch {
    public static void main(String[] args) throws IOException {
        int[] nums = {1, 2, 3, 2, 3, 4, 4, 5, 5};
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        System.out.println(result);
    }


    public static boolean repeatedSubstringPattern(String str) {
        for (int i = 1; i <= str.length() / 2; i++) {
            String sub = str.substring(0, i);
            boolean found = true;
            for (int j = i; j < str.length(); j += i) {
                if (j + i > str.length() || !str.substring(j, j + i).equals(sub)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
}
