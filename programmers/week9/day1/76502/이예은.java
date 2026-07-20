import java.util.*;

class Solution {

    int answer = 0;

    public int solution(String s) {
        for(int i=0; i<s.length(); i++) {
            s = check(s);
        }
        return answer;
    }

    public String check(String s) {
        Stack<Character> st = new Stack<>();
        List<Character> arr = new ArrayList<>();
        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++) {
            arr.add(ch[i]);
            if(!st.isEmpty() && ch[i]-st.peek()==2) st.pop();
            else if(!st.isEmpty() && ch[i]==')' && st.peek()=='(') st.pop();
            else st.push(ch[i]);
        }
        answer += st.isEmpty() ? 1 : 0;

        arr.add(arr.get(0));
        arr.remove(0);

        String str = "";
        for(int i=0; i<arr.size(); i++){
            str+=arr.get(i);
        }
        return str;
    }
}