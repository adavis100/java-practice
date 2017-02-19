package com.javapractice.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = scanner.nextInt();

        List<String> strings = findSubstrings(s, length);
        String min = findMin(strings);
        String max = findMax(strings);
        System.out.println(min);
        System.out.println(max);
    }

    private static String findMax(List<String> strings) {
        return strings.stream().sorted(Comparator.reverseOrder()).findFirst().get();
    }

    private static String findMin(List<String> strings) {
        return strings.stream().sorted().findFirst().get();
    }

    private static List<String> findSubstrings(String s, int length) {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i <= s.length() - length; i++) {
           strings.add(s.substring(i, i + length));
        }
        return strings;
    }
}
