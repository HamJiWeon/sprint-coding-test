class Solution {
    //두 정수 사이 합
    public long solution(int a, int b) {
        long answer = 0;
        //같으면 아무값
        if (a == b) {
            return a;
        }
        //크면 스왑
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}