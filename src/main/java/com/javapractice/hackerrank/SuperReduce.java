package com.javapractice.hackerrank;

import java.util.Scanner;

public class SuperReduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(superReduce(sc.next()));
    }

    private static String superReduce(String s) {
        char currentChar = s.charAt(0);

        StringBuilder sb;
        sb = new StringBuilder();
        int adjacent = 0;
        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                adjacent++;
            } else {
                if (adjacent % 2 == 1) {
                    sb.append(currentChar);
                }
                currentChar = c;
                adjacent = 1;
            }
        }
        if (adjacent % 2 == 1) {
            sb.append(currentChar);
        }

        String reduced = sb.toString();
        if (reduced.length()>0 && !s.equals(reduced))
            return superReduce(reduced);
        else if (reduced.length() == 0)
            return "Empty String";
        else
            return reduced;
    }
}
