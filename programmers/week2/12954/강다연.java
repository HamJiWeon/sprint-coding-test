class Solution {
    public long[] solution(int x, int n) {
        // 2*(0+1) = 2
        // 2*(1+1) = 4
        // 2*(2+1) = 6
        // 2*(3+1) = 8
        // 2*(4+1) = 10
        long[] answer = {};
        answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = (long) x* (i+1);
        }
        return answer;
    }
}