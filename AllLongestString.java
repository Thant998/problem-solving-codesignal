import java.util.*;
public class AllLongestString {
    public static String[] solution(String[] array) {
        int[] arrayElementLength=new int[array.length];
        List<String> longestList=new ArrayList<>();
        for (int i=0;i<array.length;i++){
            arrayElementLength[i]=array[i].length();
        }
        int max=arrayElementLength[arrayElementLength.length-1];
        for (int j=0;j<array.length;j++){
            if (array[j].length()==max){
                longestList.add(array[j]);
            }
        }
        String[] res=longestList.toArray(new String[longestList.size()]);
        return res;
    }
    public static void main(String[] args) {
        String[] stringArray={"aba",
                "aa",
                "ad",
                "vcd",
                "aba"};
        System.out.println(solution(stringArray));
    }
}