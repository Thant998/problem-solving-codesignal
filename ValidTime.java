public class ValidTime {
    public static boolean solution(String time) {
        return time.matches("(2[0-3]|1[0-9]):[0-5][0-9]");
    }
    public static void main(String[] args) {
        String s="13:59";
        System.out.println(solution(s));
    }
}