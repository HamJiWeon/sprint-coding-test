class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int i=1; i<=n; i++) {
            int a = 0;
            for(int j=i; j<n; j++) {
                a += j;

                if(a>n) break;
                if(a==n) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}