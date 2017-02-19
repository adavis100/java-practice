package com.javapractice.hackerrank;

import java.util.Scanner;

public class SherlockSquares {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long n1, n2;
        for (int i = 0; i < t; i++) {
            n1 = scanner.nextLong();
            n2 = scanner.nextLong();
            System.out.println(countSquares(n1, n2));
        }
    }

    private static int countSquares(long n1, long n2) {
        long sqrt = (long) Math.sqrt(n1);
        if(sqrt*sqrt == n1)
            return ((int) Math.sqrt(n2)) - ((int) Math.sqrt(n1)) + 1;
        else
            return ((int) Math.sqrt(n2)) - ((int) Math.sqrt(n1));
    }
}
