public class AlmostIncreasingSequence {
    public static boolean solution(int[] array) {
        boolean b = true;
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) i1 += 1;
        }
        for (int j = 0; j < array.length - 2; j++) {
            if (array[j] > array[j + 2]) i2 += 1;
        }
        if ((i1+i2)>2) b=false;
        return b;
    }
    public static void main(String[] args) {
        int[] num={1,3,2,1};
        System.out.println(solution(num));
    }
}