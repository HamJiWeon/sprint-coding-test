import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                if (c == '(') stack.push(c);
                else return false;
            }
        }

        return stack.isEmpty();
    }
}