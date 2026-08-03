import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.merge(player, 1, Integer::sum);
        }

        for (String player : completion) {
            map.merge(player, -1, Integer::sum);
        }

        for (Map.Entry<String, Integer> players : map.entrySet()) {
            if (players.getValue() != 0) return players.getKey();
        }

        return answer;
    }
}