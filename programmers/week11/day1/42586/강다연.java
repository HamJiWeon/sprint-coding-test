import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        //배포 가능 일수 계산 =  (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            queue.add(day);
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int deployDay = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= deployDay) {
                queue.poll();
                count++;
            }

            result.add(count);
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}