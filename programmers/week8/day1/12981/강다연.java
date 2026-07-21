import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        //중복 단어 x 해쉬 셋 이용
        Set<String> set = new HashSet<>();

        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String 전 = words[i - 1];
            String 현 = words[i];


            if (전.charAt(전.length() - 1) != 현.charAt(0) || set.contains(현)) {

                int num = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{num, turn};
            }

            set.add(현);
        }

        return new int[]{0, 0};
    }
}