class Solution {
    boolean solution(String s) {
        int answer = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') answer++;
            else if (c == 'y') answer--;
        }

        return answer == 0;
    }
}