public class DepositProfit {
    public static int solution(int deposit,int rate,int threshold) {
        double amount=(double) deposit;
        int year=0;
        while (amount<(double) threshold){
            amount*=(((double) rate+100.0)/100.0);
            year++;
        }
        return year;
    }
    public static void main(String[] args) {
        int d=100;
        int r=20;
        int th=170;
        System.out.println(solution(d,r,th));
    }
}
