class Solution {

    public int theHaGie(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++ ) {
            sum += i;
        }return sum;
    } //공부에 도움이 될 거 같아서 이거저거 사용해봤어요는 뱐먕이고
      //이상한거에 꽂혀서 0~9까지 더하는 메서드를 만들어 보고 싶었어요

    public int solution(int[] numbers) {
        int numberSum = 0;
        for(int i = 0; i<numbers.length; i++){
            numberSum += numbers[i];
        }
        int answer = theHaGie(0, 9) - numberSum;
        return answer;
    }
}