package leetcode;
import java.util.HashMap;
import java.util.Stack;



public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Boolean> isOpen = new HashMap<Character, Boolean>();
        isOpen.put('(', true);
        isOpen.put('{', true);
        isOpen.put('[', true);
        HashMap<Character, Character> isClosed = new HashMap<Character, Character>();
        isClosed.put(')', '(');
        isClosed.put('}', '{');
        isClosed.put(']', '[');
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (isOpen.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && isClosed.containsKey(s.charAt(i))) {
                char current = stack.pop();
                char currentClosed = isClosed.get(s.charAt(i));
                if (current != currentClosed) {
                    return false;

                }
            } else {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
