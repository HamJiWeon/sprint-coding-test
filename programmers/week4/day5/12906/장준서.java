import java.util.*;
import java.util.function.ToIntFunction;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int al = arr.length;
        for (int i = 1; i < al; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        answer = list.stream()
                .mapToInt(
                        new ToIntFunction<Integer>() {
                            @Override
                            public int applyAsInt(Integer i) {
                                return i.intValue(); // i -> i.intValue() 람다
                                //Integer::intValue 메서드 참조
                            }
                        }
                )
                .toArray();
        return answer;

    }
}