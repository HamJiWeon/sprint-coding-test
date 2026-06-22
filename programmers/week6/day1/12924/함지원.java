class Solution {
    public int solution(int n) {
        int answer = 0;

        int lt = 1, rt = 1, sum = 1;
        while (rt <= n) {
            if (sum < n) {
                sum += ++rt;
            } else if(sum == n) {
                answer++;
                sum += ++rt;
            }  else {
                sum -= lt++;
            }
        }

        return answer;
    }
}