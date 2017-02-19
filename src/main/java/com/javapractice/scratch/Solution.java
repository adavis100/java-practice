package com.javapractice.scratch;

import com.sun.org.apache.xerces.internal.impl.dv.xs.IntegerDV;

import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.util.*;


interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation is_odd() {
        return n -> n % 2 == 1;
    }

    PerformOperation is_prime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    PerformOperation is_palindrome() {
        return n -> {
            char[] digits = Integer.toString(n).toCharArray();
            for (int i = 0, j =digits.length-1; i <= j; i++, j--) {
                if (digits[i] != digits[j])
                    return false;
            }
            return true;
        };
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.is_odd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.is_prime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.is_palindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
