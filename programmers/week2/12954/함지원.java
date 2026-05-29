class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long p = 0;
        for (int i = 0; i < n; i++) {
            p += x;
            answer[i] = p;
        }

        return answer;
    }
}