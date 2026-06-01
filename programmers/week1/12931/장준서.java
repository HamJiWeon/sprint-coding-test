public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer += n % 10;// 1의 자리 추출후 더힘
            n = n / 10;//n의 가장 뒷 자리부터 순서대로 제거 후 n에 할당
        } //웨일 조건 충족 전까지 반복.

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}