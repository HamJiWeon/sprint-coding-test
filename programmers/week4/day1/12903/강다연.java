class Solution {
    public String solution(String s) {
        int length = s.length();
        int m = length / 2;

        if (length % 2 == 0) {
            return s.substring(m - 1, m + 1);
        }
        else {
            return s.substring(m, m + 1);
        }
    }
}