import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> m = new HashMap<>();

        for(String[] s:clothes) {
            m.put(s[1], m.getOrDefault(s[1], 0) +1);
        }

        List<Integer> list = m.values().stream().toList();
        for (Integer i : list) {
            answer*=i+1;
        }

        return answer-1;
    }
}