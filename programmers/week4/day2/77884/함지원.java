class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += (divisorCnt(i) % 2 == 0) ? i : -i;
        }

        return answer;
    }

    public int divisorCnt(int num) {

        int cnt = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) cnt++;
                else cnt += 2;
            }
        }

        return cnt;
    }
}