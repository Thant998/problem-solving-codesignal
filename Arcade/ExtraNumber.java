package com.minthant;

/*

Problem:
You're given three integers, a, b and c. It is guaranteed that 
two of these integers are equal to each other. What is the value of the third integer?
 */

public class ExtraNumber {
    public static int solution(int a,int b,int c){
        if ((a==b) && (a!=c)){
            return c;
        }else if (b==c && b!=a){
            return a;
        }else return b;
    }

    public static void main(String[] args) {
        int aa=2;
        int bb=7;
        int cc=7;
        System.out.println(solution(aa,bb,cc));
    }
}
