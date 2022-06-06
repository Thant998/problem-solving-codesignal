public class CenturyFromYear {
    public static int solution(int year) {
        return (year-1)/100+1;
    }
    public static void main(String[] args) {
        int y=1700;
        System.out.println(solution(y));
    }
}