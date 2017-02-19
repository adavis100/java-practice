package com.javapractice.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
    /*
    Tn+2 = (Tn+1)2 + Tn
     */
    public static BigInteger computeFib1(int zeroth, int first, int n) {

        BigInteger prev = BigInteger.valueOf(zeroth);
        BigInteger current = BigInteger.valueOf(first);
        for (int i = 0; i < n - 2; i++) {
            BigInteger temp = prev;
            prev = current;
            current = temp.add(current.multiply(current));
        }
        return current;
    }


    private static BigInteger [] fib = new BigInteger[20];
    static {
        for (int i = 0; i < 20; i++) {
            fib[i] = BigInteger.ZERO;
        }
    }

    public static BigInteger computeFib(int zeroth, int first, int n) {
        fib[0] = BigInteger.valueOf(zeroth);
        fib[1] = BigInteger.valueOf(first);
        for (int i = 2; i < n; i++) {
            if (fib[i].equals(BigInteger.ZERO))
                fib[i] = fib[i-2].add(fib[i-1].multiply(fib[i - 1]));
        }
        return fib[n - 1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeroth = sc.nextInt();
        int first = sc.nextInt();
        int n = sc.nextInt();

        long startTime = System.nanoTime();
        BigInteger result = computeFib1(zeroth, first, n);
        long endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Time = " + (endTime - startTime));

        startTime = System.nanoTime();
        result = computeFib(zeroth, first, n);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Lookup alg Time = " + (endTime - startTime));

        startTime = System.nanoTime();
        result = computeFib1(zeroth, first, n);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Time = " + (endTime - startTime));

        startTime = System.nanoTime();
        result = computeFib(zeroth, first, n);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Lookup alg Time = " + (endTime - startTime));
    }
}
