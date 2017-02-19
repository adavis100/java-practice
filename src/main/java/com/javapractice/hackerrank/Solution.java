package com.javapractice.hackerrank;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        s = s.replaceAll("^[!,?._'@ ]+", "");
        if(s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] tokens = s.split("[!,?._'@ ]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
