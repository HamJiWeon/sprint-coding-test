import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) - 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }

        return "";
    }
}