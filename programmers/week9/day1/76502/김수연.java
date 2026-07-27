import java.util.*;

class Solution {
    public int solution(String s) {
        int result = 0;

        for (int x = 0; x < s.length(); x++) {
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt((x + i) % s.length());

                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(')
                            || (ch == ']' && top != '[')
                            || (ch == '}' && top != '{')) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                result++;
            }
        }

        return result;
    }
}