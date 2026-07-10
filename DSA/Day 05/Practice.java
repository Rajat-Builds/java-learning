import java.util.Stack;

public class Practice {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
    
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if (c==')' && top != '(' || (c == ']' && top != '[') || (c == '}' && top != '{') ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean result1 = isValid("{[()]}");
        System.out.println("Test 1: " + result1);

        boolean result2 = isValid("{[(])}");
        System.out.println("Test 2: " + result2);

        boolean result3 = isValid("{[");
        System.out.println("Test 3: " + result3);
    }
}
