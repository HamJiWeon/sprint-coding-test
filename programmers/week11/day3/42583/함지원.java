import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }

        int sum = 0;
        for (int truck : truck_weights) {
            while (true) {
                sum -= queue.poll();

                if (sum + truck <= weight) {
                    sum += truck;
                    queue.add(truck);
                    answer++;
                    break;
                } else {
                    queue.add(0);
                    answer++;
                }
            }
        }
        answer += bridge_length;

        return answer;
    }
}