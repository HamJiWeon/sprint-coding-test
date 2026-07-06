import java.util.*;

class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int t = n + 1;

        while (true) {

            int targetCount = Integer.bitCount(t);

            if (count == targetCount) {
                break;
            }

            t++;
        }


        return t;
    }
}