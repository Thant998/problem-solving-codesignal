package com.minthant;

/*
Problem:
Given an array a that contains only numbers in the range from 1 to array length,
Find the first duplicate number for which the second occurrence has the minimal index.

For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.

There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index
than the second occurrence of 2 does, so the answer is 3.

For a = [2, 2], the output should be solution(a) = 2;
For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.
 */
import java.util.*;
public class FirstDuplicate {
    public static int solution(int[] array){
        //int duplicate=-1;
        HashSet<Integer> s=new HashSet<>();
        for (int i=0;i<array.length;i++){
            if (s.contains(array[i])){
                return array[i];
            } else s.add(array[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,1,3,2,1,3,5,3,2};
        System.out.println(solution(arr));
    }
}
