public class ShapeArea {
    public static int showArea(int n) {
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        }else{
            return (n*n)+((n-1)*(n-1));
        }
    }
    public static void main(String[] args) {
        int num=3;
        System.out.println(showArea(num));
    }
}
