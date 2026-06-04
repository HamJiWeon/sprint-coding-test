class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        for(int j = 0; j<10; j++){
            answer+=j;
        }
        answer = answer-sum;
        return answer;
    }
}