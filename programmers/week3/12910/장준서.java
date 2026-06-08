import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList();
        for(int i = 0; i< arr.length; i++) {
            if( arr[i] % divisor == 0 ) {
                answerList.add(arr [i]);
            }
        }

        if(answerList.isEmpty()) {
            return new int[] {-1};
        }

        Collections.sort(answerList);
        answer = answerList.stream().mapToInt(Integer :: intValue).toArray();
        return answer;
    }
    //이번거 모르는 문법이 너무 많았어요 슬퍼요
}