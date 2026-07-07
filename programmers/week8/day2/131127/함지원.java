import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> jh = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            jh.put(want[i], number[i]);
        }

        Map<String, Integer> event = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            event.merge(discount[i], 1, Integer::sum);
        }

        if (isSame(jh, event)) {
            answer++;
        }

        for (int i = 10; i < discount.length; i++) {
            event.merge(discount[i], 1, Integer::sum);

            String out = discount[i - 10];
            event.merge(out, -1, Integer::sum);
            if (event.get(out) == 0) {
                event.remove(out);
            }

            if (isSame(jh, event)) {
                answer++;
            }
        }

        return answer;
    }

    boolean isSame(Map<String, Integer> jh, Map<String, Integer> event) {
        for (String key : jh.keySet()) {
            if (!event.containsKey(key) || !jh.get(key).equals(event.get(key))) {
                return false;
            }
        }

        return true;
    }
}