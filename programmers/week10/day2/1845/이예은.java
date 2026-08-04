import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for(int i:nums) {
            m.put(i, m.getOrDefault(i, 0) +1);
        }

        return m.size()>=nums.length/2 ? nums.length/2 : m.size();
    }
}