import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int k = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        return hashSet.size() > k ? k : hashSet.size();
    }
}