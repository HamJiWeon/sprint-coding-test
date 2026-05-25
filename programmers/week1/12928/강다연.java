import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        int answer = 0;
        //1)
        // for(int i = 1; i<=n; i++){
        //     if((n % i) == 0){
        //         answer += i;
        //     }
        // }
        // return answer;

        //2)
        //Stream 수업 확장하고 싶어서, 코드 참고하여 작성해봤습니다.
        //IntStream.rangeClosed(0, 10)은 0부터 10까지(끝값 포함) 순차 스트림을 만듭니다.
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).sum();

    } 
}
