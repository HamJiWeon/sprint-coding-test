import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {

        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : people) {
            deque.addLast(i);
        }

        int count = 0;

        while (!deque.isEmpty()) {
            if (deque.size() == 1) {
                deque.pollFirst();
                count++;
                break;
            }

            int light = deque.peekFirst();
            int heavy = deque.peekLast();

            if (light + heavy <= limit) {
                deque.pollFirst();
                deque.pollLast();
            } else {
                deque.pollLast();
            }
            count++;
        }

        return count;
    }
}
