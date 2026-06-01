lass Solution {
public int solution(int n) {
    int answer = 0;

    for(int i = 1; i<=n; ++i){
        //약수 1이상 n이하 i는 1
        if(n % i == 0){
            // 나누어 떨어지면 answer에 i를 더힌다.
            answer += i;
        }
    }

    return answer;
}
}