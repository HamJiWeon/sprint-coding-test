import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i : tangerine) {
            m.put(i, m.getOrDefault(i, 0) +1);
        }

        List<Integer> list = new ArrayList<>(m.values());
        list.sort((a, b)->b-a);

        int c=0;
        for (Integer i : list) {
            k-=i;
            c++;
            if(k<=0) return c;
        }
        return 0;
    }
}