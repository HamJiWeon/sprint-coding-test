public class Solution {
    public int solution(int n) {
        int answer=0;
        char[] c = String.valueOf(n).toCharArray();
        for(int i=0; i<c.length; i++){
            answer += c[i] - '0';
        }
        return answer;
    }
}