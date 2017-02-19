package com.javapractice.hackerrank;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(countWords(s));
    }

    static int countWords(String s) {
        return s.split("[A-Z]").length;
    }
}
