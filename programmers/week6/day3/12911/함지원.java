class Solution {
    public int solution(int n) {
        int answer = Integer.bitCount(n);

        while(true) {
            if (Integer.bitCount(++n) == answer) break;
        }

        return n;
    }
}