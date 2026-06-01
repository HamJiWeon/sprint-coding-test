class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long answer = 0L;
        if(sqrt % 1 == 0){
            answer = ((long)sqrt+1)*((long)sqrt+1);
        }else{ answer = -1;}

        return answer;
    }
}