class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i< a.length; i++) {
            int anum = a[i];
            int bnum = b[i];
            answer += anum * bnum;
        }

        return answer;
    }
}