import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> number = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            number.add(arr[i]);
        }

        int[] answer = {};
        if(number.size() == 1){
            return new int[]{-1};
        }else {
            number.remove(Integer.
                    valueOf(Collections.
                            min(number)));}
        answer = number.stream().
                mapToInt(Integer::intValue).
                toArray();

        return answer;
    }
}