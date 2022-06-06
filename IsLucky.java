public class IsLucky {
    public static boolean solution(int num) {
        String s=Integer.toString(num);
        int mid=s.length()/2;
        int sum=0;
        for (int i=0;i<mid;i++){
            sum+=s.charAt(i);
            sum-=s.charAt(i+mid);
        }
        return sum==0;
    }
    public static void main(String[] args) {
        int ticketNumber=123330;
        System.out.println(solution(ticketNumber));
    }
}
