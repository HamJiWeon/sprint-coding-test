import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");

        return Arrays.stream(answer)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}