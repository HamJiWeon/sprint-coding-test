import java.util.*;

class Solution {
    public int solution(String[][] clothes) {

        HashMap<String, Integer> clothesMap = new HashMap<>();
        for (String[] sa : clothes) {
            clothesMap.put(sa[1], clothesMap.getOrDefault(sa[1], 0) + 1);
        }

        int combi = 1;
        for (int value : clothesMap.values()) {
            combi *= (value + 1);
        }

        return combi - 1;
    }
}