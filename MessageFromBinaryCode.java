public class MessageFromBinaryCode {
    public static String solution(String code) {
        StringBuilder message=new StringBuilder();
        for (int i=0;i<code.length();i+=8){
            char c=(char) Integer.parseInt(code.substring(i,i+8),2);
            message.append(c);
        }
        return message.toString();
    }
    public static void main(String[] args) {
        String s="010010000110010101101100011011000110111100100001";
        System.out.println(solution(s));
    }
}