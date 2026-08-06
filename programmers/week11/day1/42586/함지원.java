import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int max = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        int result = 1;
        for (int i = 1; i < progresses.length; i++) {
            int days = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (days <= max) {
                result++;
            } else {
                answer.add(result);
                result = 1;
                max = days;
            }
        }

        answer.add(result);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}