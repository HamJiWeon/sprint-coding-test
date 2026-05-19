class Solution {
    public int[] solution(long n) {
        int s = String.valueOf(n).length();
        int[] answer = new int[s];
        int i = 0;
        while(n>0){
            answer[i] = (int)(n % 10);
            n = n/10;
            i++;
        }
        return answer;
    }
}