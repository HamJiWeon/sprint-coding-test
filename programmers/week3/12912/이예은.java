import java.lang.Math;

class Solution {
    public long solution(int a, int b) {
        long answer=0;
        int A = Math.min(a, b);
        int B = Math.max(a, b);
        for(int i=A; i<=B; i++){
            answer+=i;
        }
        return answer;
    }
}