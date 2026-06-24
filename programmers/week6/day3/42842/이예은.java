import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int a = 0, b = 0;
        List<Integer> list = a(yellow);

        for (int i = 0; i < (list.size() + 1) / 2; i++) {
            if (((list.get(i) + 2) * 2 + (list.get(list.size() - i - 1) + 2) * 2) - 4 == brown) {
                a = list.get(i) + 2;
                b = list.get(list.size() - i - 1) + 2;
                return new int[]{b, a};
            }
        }


        return answer;
    }

    public List<Integer> a(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

}