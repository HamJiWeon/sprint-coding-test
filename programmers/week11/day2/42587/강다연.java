import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
      
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();

            boolean rank0 = false;

            for (int index : queue) {
                //인덱스 위치에 있는 값이, 현재 값보다 높으면 true
                if (priorities[index] > priorities[now]) {
                    rank0 = true;
                    break;
                }
            }

            if (rank0) {
                queue.add(now);
            } else {
                answer++;

                if (now == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}