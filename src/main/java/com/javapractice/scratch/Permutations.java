package com.javapractice.scratch;

import java.util.*;

import static java.util.Arrays.copyOf;


public class Permutations {
    Set<String> stringPermutations(String s) {
        var set = new HashSet<String>();

        doPerms(s.toCharArray(), 0, s.length(), set);
        return set;
    }

    private void doPerms(char[] str, int i, int length, Set<String> set) {
        if (i == length) {
            set.add(new String(str));
        } else {
            for (int j = i; j < length; j++) {
                swap(str, i , j);
                doPerms(str, i + 1, length, set);
                swap(str, i , j);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }
}
