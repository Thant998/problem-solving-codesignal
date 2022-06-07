public class SumUpNumber {
    public static int solution(String inputString){
        int sum=0;
        String string="";
        for (int i=0;i<inputString.length();i++){
            if (Character.isDigit(inputString.charAt(i))){
                string+=inputString.charAt(i);
            } else if (!string.isEmpty()){
                sum+=Integer.valueOf(string);
                string="";
                }
            }
        if (!string.isEmpty()){
            sum+=Integer.valueOf(string);
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="123450";
        System.out.println(solution(s));
    }
}
