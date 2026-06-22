import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        int[] b = new int[B.length];
        int j=0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=B.length-1; i>=0; i--) {
            b[j] = B[i];
            j++;
        }

        for(int i=0; i<A.length; i++) {
            answer+= A[i]*b[i];
        }

        return answer;
    }
}