class Solution {
    public int[] solution(String s) {

        int cnt = 0, size = 0;
        while (!s.equals("1")) {
            int bitCnt = s.replace("0", "").length();
            size += s.length() - bitCnt;

            s = Integer.toBinaryString(bitCnt);

            cnt++;
        }

        return new int[]{cnt, size};
    }
}