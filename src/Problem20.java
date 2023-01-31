import java.util.Stack;

public class Problem20 {

    public static boolean isValid(String s) {
        Stack<Character> x = new Stack<>();

        for (char i : s.toCharArray()) {

            if (i == '(' || i == '{' || i == '[') {
                x.push(i);
            } else if (i == ')' && !x.isEmpty() && x.peek() == '(') {
                x.pop();
            } else if (i == ']' && !x.isEmpty() && x.peek() == '[') {
                x.pop();
            } else if (i == '}' && !x.isEmpty() && x.peek() == '{') {
                x.pop();
            } else {
                return false;
            }

        }

        return x.isEmpty();
    }

    public static void main(String arg[]) {
        String s = "(]";
        System.out.println(isValid(s));

    }
}
