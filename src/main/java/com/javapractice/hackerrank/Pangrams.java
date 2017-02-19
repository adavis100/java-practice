package com.javapractice.hackerrank;

import java.util.Scanner;

public class Pangrams {
    private static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        boolean pangram = true;
        for (int i = 0; i < 26; i++) {
            if(alphabet[i] == false) {
                pangram = false;
            }
        }
        return pangram;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(isPangram(input)) {
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }
}
