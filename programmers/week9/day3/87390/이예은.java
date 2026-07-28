import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];

        int a=0;
        for(long i=left; i<=right; i++) {
            answer[a] = (int)Math.max(i/n, i%n) +1;
            a++;
        }
        return answer;
    }
}