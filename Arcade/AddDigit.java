package com.minthant;

/*
Problem:
You are given a two-digit integer n. Return the sum of its digits.

For n = 29, the output should be
solution(n) = 11.
 */

public class AddDigit {

    public static void main(String[] arguments) {
        int n=225;
        String s=Integer.toString(n);
        int sum=0;
        for (int i=0;i<s.length();i++){
            sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(sum);
    }
}
