public class VariableName {
    public static boolean solution(String name) {
        return name.matches("^[a-zA-Z_]+[a-zA-Z_0-9]");
    }
    public static void main(String[] args) {
        String s="_ab99";
        System.out.println(solution(s));
    }
}
