public class FindEmailDomain {
    public static String solution(String address) {
        int i=address.lastIndexOf("@");
        return address.substring(i+1);
    }
    public static void main(String[] args) {
        String s="prettyandsample@example.com";
        System.out.println(solution(s));
    }
}
