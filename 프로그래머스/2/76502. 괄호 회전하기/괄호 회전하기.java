import java.util.*;

class Solution {
    public int solution(String s) {
        int point = 0;

        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean valid = true;

            for (int j = 0; j < ss.length(); j++) {
                char c = ss.charAt(j);

                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        valid = false;
                        break;
                    }
                    char open = stack.peek();
                    if ((open == '(' && c == ')') ||
                        (open == '[' && c == ']') ||
                        (open == '{' && c == '}')) {
                        stack.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid && stack.isEmpty()) {
                point++;
            }
        }

        return point;
    }
}
