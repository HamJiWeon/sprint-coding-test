class Solution {

    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = LCM(arr[i], answer);
        }

        return answer;
    }

    int LCM(int a, int b) {
        return a / GCD(a, b) * b;
    }

    int GCD(int a, int b) {
        int temp = 0;

        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}