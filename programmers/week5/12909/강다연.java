class Solution {
    boolean solution(String s) {
        int count = 0;

        // s.toCharArray()를 통해 문자열을 char[] 배열로 변환 후 향상된 for문 사용
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else {
                count--;
            }


            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}