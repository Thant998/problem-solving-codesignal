import java.util.*;
public class SumUpNumber {
    public static int solution(int[][] matrix) {
        HashSet<String> hs = new HashSet<String>();
        if(matrix.length == 1 || matrix[0].length == 1) return 0;
        for(int i = 1; i<matrix.length;i++){
            for(int j = 1;j<matrix[0].length;j++){
                hs.add( matrix[i-1][j-1]+","
                        +matrix[i-1][j]+","
                        +matrix[i][j-1]+","
                        +matrix[i][j]);
            }
        }

        return hs.size();
    }
    public static void main(String[] args) {
        int[][] s={{1,2,1},
                {2,2,2},
                {2,2,2},
                {1,2,3},
                {2,2,1}};
        System.out.println(solution(s));
    }
}
