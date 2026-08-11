import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;

        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> trucks = new LinkedList<>();

        for (int weight2 : truck_weights) {
            trucks.add(weight2);
        }

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (!trucks.isEmpty() || currentWeight > 0) {
            answer++;

            currentWeight -= bridge.poll();

            if (!trucks.isEmpty() && currentWeight + trucks.peek() <= weight) {
                int truck = trucks.poll();
                bridge.add(truck);
                currentWeight += truck;
            } else {
                bridge.add(0);
            }
        }

        return answer;
    }
}