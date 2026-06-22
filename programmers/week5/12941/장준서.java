import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int l = 0;
        int r = B.length - 1;
        while(l < r) {
            int c = B[l];
            B[l] = B[r];
            B[r] = c;
            l++;
            r--;
        }

        int a = A.length;
        for(int i = 0; i < a; i++ ){
            answer  += A[i] * B[i];
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}