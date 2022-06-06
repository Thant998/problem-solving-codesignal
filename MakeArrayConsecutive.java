import java.util.*;
public class MakeArrayConsecutive {
    public static int solution(int[] array) {
        Arrays.sort(array);
        int n=array[array.length-1]-array[0];
        return n-array.length+1;
    }
    public static void main(String[] args) {
        int[] num={6, 2, 4, 8};
        System.out.println(solution(num));
    }
}