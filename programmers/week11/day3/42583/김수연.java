import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        int bridgeWeight = 0;
        int idx = 0;
        int len = truck_weights.length;

        Deque<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            answer++;

            int out = bridge.poll();
            bridgeWeight -= out;

            if (idx < len && bridgeWeight + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                bridgeWeight += truck_weights[idx];
                idx++;
            } else {
                bridge.offer(0);
            }

            if (idx == len && bridgeWeight == 0) {
                break;
            }
        }

        return answer;
    }
}