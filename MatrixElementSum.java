public class MatrixElementSum {
    public static int solution(int[][] matrix) {
        int sum=0;
        for (int i=0;i<matrix[0].length;++i){
            for (int j=0;j<matrix.length;++j){
                if (matrix[j][i]>0){
                    sum+=matrix[j][i];
                } else break;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrixArray={{0,1,1,2},{0,5,0,0},{2,0,3,3}};
        System.out.println(solution(matrixArray));
    }
}