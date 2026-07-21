public class Solution {
    public int solution(int n) {
        int ans = 0;

        String bin = Integer.toBinaryString(n);

        for (char ch : bin.toCharArray()) {
            if (ch == '1') {
                ans++;
            }
        }

        return ans;
    }
}