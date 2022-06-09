package com.minthant;

/*

Problem:
You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second 
item weighs weight2 and is worth value2. What is the total maximum value of the items you can take with you, 
assuming that your max weight capacity is maxW and you can't come back for the items later?

 */

public class KnapsackLight {
    public static int solution(int value1,int weight1,int value2,int weight2,int maxW){
        if (weight1+weight2<=maxW){
            return value1+value2;
        } else if (weight1<=maxW && weight2<=maxW){
            return Integer.max(value1,value2);
        }else if (weight1<=maxW){
            return value1;
        }else if (weight2<=maxW){
            return value2;
        }
        return 0;
    }

    public static void main(String[] args) {
        int v1=10;
        int w1=5;
        int v2=6;
        int w2=4;
        int max=9;
        System.out.println(solution(v1,w1,v2,w2,max));
    }
}