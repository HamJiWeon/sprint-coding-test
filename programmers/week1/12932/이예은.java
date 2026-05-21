public class Solution {
    public int[] solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        int[] answer = new int[c.length];
        for(int i=0; i<c.length; i++){
            answer[i] = c[c.length-1-i] -'0';
        }
        return answer;
    }
}