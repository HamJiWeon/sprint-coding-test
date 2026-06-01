class Solution {
    public double solution(int[] arr) {
        //조건문을 위한 초기화
        double answer = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+= arr[i];
            answer = (double)sum/(i+1);
        }
        return answer;
    }
}