import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if(st.empty() || st.peek()==ch || st.peek()==')') st.push(ch);
            else st.pop();
        }
        return st.empty();
    }
}