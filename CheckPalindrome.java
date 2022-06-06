public class CheckPalindrome {
    public static boolean solution(String inputString) {
        String s="";
        for (int i=inputString.length()-1;i>=0;i--){
            s+=inputString.charAt(i);
        }
        return inputString.equals(s);
    }
    public static void main(String[] args) {
        String s="ab";
        System.out.println(solution(s));
    }
}
