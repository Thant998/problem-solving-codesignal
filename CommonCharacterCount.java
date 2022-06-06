public class CommonCharacterCount {
    public static int solution(String s1,String s2) {
        int count=0;
        for (int i=0;i<s1.length();i++){
            if (s2.contains(String.valueOf(s1.charAt(i)))){
                count++;
                s2=s2.replaceFirst(String.valueOf(s1.charAt(i)),"");
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String str1="aabcc";
        String str2="adcaa";
        System.out.println(solution(str1,str2));
    }
}
