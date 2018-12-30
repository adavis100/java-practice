package com.javapractice.scratch;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class Scratch {
    /**
     *
     *2
     i.like.this.program.very.much
     pqr.mno
     rqp.onm
     mno.pqr

     * @param args
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int testCases = scanner.nextInt();
//        for (int i = 0; i < testCases; i++) {
//            String s = scanner.next();
//
//            System.out.println(removeZeros(s));
//        }
//    }

    public static void main(String[] args) throws IOException {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        int total = 0;
        int multiplier = 1;

        while (n > 0) {
            int currentDigit = n % 10;
            int currentSquare = currentDigit * currentDigit;
            total += (currentSquare) * multiplier;
            multiplier *= (currentSquare <= 10 ? 10 : 100);
            n /= 10;
        }
        return total;
    }
}
