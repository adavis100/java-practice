package com.javapractice.hackerrank;

import java.util.Stack;

/**
 * From leetcode.com:
 *
 * Implement a basic calculator to evaluate a simple expression string.
 *
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative
 * integers and empty spaces .
 *
 * You may assume that the given expression is always valid.
 *
 * Some examples:
 * "1 + 1" = 2
 * " 2-1 + 2 " = 3
 * "(1+(4+5+2)-3)+(6+8)" = 23
 */
public class Calculator {
    public int calculate(String s) {
        char[] tokens = s.toCharArray();

        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            int num = 0;
            if(tokens[i] >= '0' && tokens[i] <= '9') {
                num += tokens[i] - '0';
                while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    num *= 10;
                    num += tokens[i] - '0';
                    i++;
                }
                values.push(num);
            }

            if(tokens[i] == '+') {

            }
        }
//        boolean plus = true;
//        String str = s.replaceAll(" ", "");
//        char[] chars = str.toCharArray();
//        int sum = 0;
//
//        int i = 0, num;
//        while(i < chars.length) {
//            // parse a number
//            String numStr = "";
//            while(i < chars.length && chars[i] >= '0' && chars[i] <= '9') {
//                numStr += chars[i] - '0';
//                i++;
//            }
//            num = Integer.parseInt(numStr);
//            if(plus) {
//                sum += num;
//            } else {
//                sum -= num;
//            }
//
//            if(i < chars.length && chars[i] == '+') {
//                plus = true;
//                i++;
//            } else if(i < chars.length && chars[i] == '-') {
//                plus = false;
//                i++;
//            }
//        }
//        return sum;
        return 0;
    }
}
