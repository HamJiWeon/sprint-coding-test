class Solution {
    public String solution(String s) {
        String answer = "";

        boolean isFirst = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                isFirst = true;
                answer += c;
            } else if (isFirst) {
                answer += Character.toUpperCase(c);
                isFirst = false;
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }
}
