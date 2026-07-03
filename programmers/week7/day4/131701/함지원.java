import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;

        int[] circle = new int[n * 2];
        for (int i = 0; i < circle.length; i++) {
            circle[i] = elements[i % n];
        }

        Set<Integer> sums = new HashSet<>();

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < len; i++) {
                    sum += circle[start + i];
                }

                sums.add(sum);
            }
        }

        return sums.size();
    }
}