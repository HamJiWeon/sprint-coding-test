import java.util.Stack;

class Solution {

  public int solution(String s) {
    if (s.length() % 2 != 0) {
      return 0;
    }

    int count = 0;

    for (int i = 0; i < s.length(); i++) {

      String turnS = s.substring(i) + s.substring(0, i);

      Stack<Character> stack = new Stack<>();
      boolean isValid = true;

      for (char c : turnS.toCharArray()) {

        if (c == '(' || c == '{' || c == '[') {
          stack.push(c);
        } else if (stack.isEmpty()) {
          isValid = false;
          break;
        } else {
          char top = stack.peek();

          if ((c == ')' && top == '(') ||
              (c == '}' && top == '{') ||
              (c == ']' && top == '[')) {
            stack.pop();

          } else {
            isValid = false;
            break;
          }
        }
      }
      if (isValid && stack.isEmpty()) {
        count++;
      }
    }

    return count;

  }
}