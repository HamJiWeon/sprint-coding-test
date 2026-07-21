class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) break;
            }
        }
        return answer;
    }
}

/* 코드 자체는 이해 했는데 도저히 문제를 보고 이 로직을 떠올리지 못 하겠음.
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i*(i-1)/2 < n; i++){
            if((n-i*(i-1)/2) % i == 0){
                int z = 0;
                z += i;
                System.out.println(z);
                answer++;
            }
        }
        return answer;
    }
}
 */