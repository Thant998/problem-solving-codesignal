package com.minthant;
/*
An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.

Armstrong Number Example
1: 1^1 = 1
2: 2^1 = 2
152: 1^3+5^3+2^3=134(Not armstrong number)
407: 4^3+0^3+7^3=407(is armstrong number)
 */

import java.util.Scanner;
public class IsArmStrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        int temp,remainder,result=0;
        temp=num;
        while (temp!=0){
            remainder=temp%10;
            result+=Math.pow(remainder,3);
            temp/=10;
        }
        if (result==num){
            System.out.println(num+" "+"is ArmStrong Number");
        } else System.out.println(num+" "+"is not ArmStrong Number");
    }
}