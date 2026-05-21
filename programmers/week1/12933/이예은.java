import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        for(int i=0; i<c.length; i++) {
            answer += c[c.length-1-i] -'0';
        }
        return Long.parseLong(answer);
    }
}