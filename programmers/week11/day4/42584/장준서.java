import java.util.Stack;
class Solution {
  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    //가격 길이 배열 선언

    Stack<Integer> stack = new Stack<>();
    //가격 하락이 확인되지 않은 주식의 가격유지 시간 임시 저장

    for(int i = 0; i < prices.length; i++){
      while(!stack.isEmpty() && prices[stack.peek()] > prices[i] ) {
        int target = stack.pop();
        answer[target] = i - target;
      }
      stack.push(i);
    }

    while(!stack.isEmpty()) {
      int target = stack.pop();
      answer[target] = prices.length - 1 - target;
      //인덱스는 0,1,2,3,4
      //길이는 5라서 -1을 해줌.
    }

    return answer;
  }
}