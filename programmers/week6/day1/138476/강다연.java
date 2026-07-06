import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {

        // 1. 귤 개수 세기
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        // 2. 스트림으로 수량 추출 -> 내림차순 정렬 -> 리스트 변환
        List<Integer> counts = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // 3. k개 채우기
        int answer = 0;
        for (int count : counts) {
            k -= count;
            answer++;
            if (k <= 0) break;
        }

        return answer;
    }
}