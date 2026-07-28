import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {

        int len = (int) (right - left + 1);
        int[] arr = new int[len];

        for (long idx = left; idx <= right; idx++) {
            long row = idx / n;
            long col = idx % n;

            long max = Math.max(row, col);
            arr[(int) (idx - left)] = (int) (max + 1);
        }

        return arr;
    }
}