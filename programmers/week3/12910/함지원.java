import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr);

        for (int num : arr) {
            if (num % divisor == 0) answer.add(num);
        }

        return answer.isEmpty() ? new int[]{-1} : answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}