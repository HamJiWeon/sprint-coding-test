import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> dq = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            dq.offerLast(new int[]{i, priorities[i]});
        }

        int order = 0;

        while (!dq.isEmpty()) {
            int[] current = dq.pollFirst();

            boolean hasHigher = false;
            for (int[] p : dq) {
                if (p[1] > current[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                dq.offerLast(current);
            } else {
                order++;
                if (current[0] == location) {
                    return order;
                }
            }
        }

        return -1;
    }
}