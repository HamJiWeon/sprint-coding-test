class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int arrLength = arr.length;
        int total = 0;
        for(int i : arr){
            total += i;
        }

        answer = (double)total / arrLength;
        return answer;
    }
}