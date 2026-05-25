import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> answer = Stream.of(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(answer);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}