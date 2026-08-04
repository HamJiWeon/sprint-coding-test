import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> number = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            number.add(nums[i]);
        }

        return Math.min(number.size(), nums.length / 2);
    }
}