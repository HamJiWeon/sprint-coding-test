class Solution {
    public int[] solution(long n) {
        int s = String.valueOf(n).length();
        //valueOf(n) 숫자를 문자열로 변환 메서드
        //length() 문자열의 길이를 int로 반환
        int[] answer = new int[s];
        //int[s] 배열 선언 후 int[]타입 변수 answer에 할당
        int i =0; // whille에서 사용할 값을 저장할 변수 선언
        while(n>0){// n이 0이상면 함수 실행 0이면 종료
            answer[i] = (int)(n % 10);
            //i= 0 -> 0번쨰 idx에 n을 10으로 나눈 나머지를 int로 형 변환 후 할당.
            // n이 123일 경우 123 / 10 = 12.3 나머지인 3만 정수 형태로 할당.
            n = n/10;
            // n을 10으로 나눠서 자연수 부분만 n에 재할당
            // 123인 경우 123/ 10= 12.3-> 12만 n에 재 할당.
            i++; // i +1
        }


        return answer;
    }      // 결론  [3, 2, 1]이 됨.
}
