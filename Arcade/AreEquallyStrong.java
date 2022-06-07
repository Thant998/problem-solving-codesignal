public class AreEquallyStrong {
    public static boolean solution(int yourLeft,int yourRight,int friendLeft,int friendRight) {
        boolean strong=Integer.max( yourLeft, yourRight)==Integer.max( friendLeft,friendRight);
        boolean weak=Integer.min( yourLeft, yourRight)==Integer.min( friendLeft,friendRight);
        return strong&&weak;

    }
    public static void main(String[] args) {
        int yLeft=10;
        int yRight=15;
        int fLeft=15;
        int fRight=10;
        System.out.println(solution(yLeft,yRight,fLeft,fRight));
    }
}