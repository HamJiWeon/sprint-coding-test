import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> second = new LinkedList<>();

        for (int price : prices) {
            second.add(price);
        }

        int index = 0;

        while (!second.isEmpty()) {
            int current = second.poll();
            int count = 0;

            for (int next : second) {
                count++;

                if (next < current) {
                    break;
                }
            }

            answer[index] = count;
            index++;
        }

        return answer;
    }
}