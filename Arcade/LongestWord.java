public class LongestWord {
    public static String solution(String text) {
        String[] stringArray=text.split("[^a-zA-Z]");
        String temp="";
        for (int i=0;i<stringArray.length;i++){
            if (stringArray[i].length()>=temp.length()){
                temp=stringArray[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        String inputString="Ready, steady, go!";
        System.out.println(solution(inputString));
    }
}
