import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int start = 0; start <= discount.length - 10; start++) {
            Map<String, Integer> windowMap = new HashMap<>();
            for (int j = start; j < start + 10; j++) {
                windowMap.put(discount[j], windowMap.getOrDefault(discount[j], 0) + 1);
            }

            if (windowMap.equals(wantMap)) {
                answer++;
            }
        }

        return answer;
    }
}