import java.util.HashMap;
import java.util.Map;

class Solution {

  public int solution(String[] want, int[] number, String[] discount) {
    int answer = 0;

    Map<String, Integer> wantMap = new HashMap<>();
    for (int i = 0; i < want.length; i++) {
      wantMap.put(want[i], number[i]);
    }

    for (int i = 0; i <= discount.length - 10; i++) {

      Map<String, Integer> discountMap = new HashMap<>();

      for (int j = i; j < i + 10; j++) {
        String item = discount[j];
        discountMap.put(item, discountMap.getOrDefault(item, 0) + 1);
      }

      boolean isMatch = true;

      for (String key : wantMap.keySet()) {
        int wantCount = wantMap.get(key);
        int discountCount = discountMap.getOrDefault(key, 0);

        if (discountCount < wantCount) {
          isMatch = false;
          break;
        }
      }

      if (isMatch) {
        answer++;
      }
    }

    return answer;
  }
}